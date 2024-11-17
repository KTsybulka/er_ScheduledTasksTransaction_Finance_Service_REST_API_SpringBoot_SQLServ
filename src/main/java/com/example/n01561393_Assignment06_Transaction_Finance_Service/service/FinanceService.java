package com.example.n01561393_Assignment06_Transaction_Finance_Service.service;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.entity.Finance;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.repository.FinanceRepository;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    private final FinanceRepository financeRepository;

    public FinanceService(FinanceRepository financeRepository) {
        this.financeRepository = financeRepository;
    }

    public Finance getFinanceBySku(String sku){
        return financeRepository.findBySku(sku);
    }

    public void addFinance(Finance finance){
        financeRepository.save(finance);
    }

}
