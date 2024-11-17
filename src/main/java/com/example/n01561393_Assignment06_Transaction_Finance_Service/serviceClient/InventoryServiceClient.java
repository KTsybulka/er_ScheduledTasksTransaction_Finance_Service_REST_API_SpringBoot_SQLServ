package com.example.n01561393_Assignment06_Transaction_Finance_Service.serviceClient;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.entity.ProductInventory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class InventoryServiceClient {

    @Value("${transactionInventoryAdapter.urlTemplate}")
    private String urlTemplate;

    private final RestTemplate restTemplate;

    public InventoryServiceClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ProductInventory getInventoryDetail(String sku){
        ProductInventory productInventory = restTemplate.getForObject(urlTemplate, ProductInventory.class, sku);
        return productInventory;
    }
}
