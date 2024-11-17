package com.example.n01561393_Assignment06_Transaction_Finance_Service.service;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.entity.ProductInventory;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.entity.Transaction;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.repository.TransactionRepository;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.serviceClient.InventoryServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Slf4j
@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final InventoryServiceClient inventoryServiceClient;

    public TransactionService(TransactionRepository transactionRepository, InventoryServiceClient inventoryServiceClient) {
        this.transactionRepository = transactionRepository;
        this.inventoryServiceClient = inventoryServiceClient;
    }

    public Transaction addRecord(String sku) {
        //call inventory service to get the quontaty of the sku
        ProductInventory productInventory = inventoryServiceClient.getInventoryDetail(sku);
        //save the data to the transaction table
        if(Objects.isNull(productInventory)){
            log.error("Product inventory not found for sku: {}", sku);
            return null;
        }

        return transactionRepository.save(populateTransactionData(productInventory));
    }

    private Transaction populateTransactionData(ProductInventory productInventory) {
        return Transaction.builder()
                .sku(productInventory.getSku())
                .quantity(productInventory.getQuantity())
                .localDateTime(LocalDateTime.now())
                .build();
    }

}
