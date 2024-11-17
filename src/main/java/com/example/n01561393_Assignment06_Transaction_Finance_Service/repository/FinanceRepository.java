package com.example.n01561393_Assignment06_Transaction_Finance_Service.repository;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.entity.Finance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends JpaRepository<Finance, Long> {
    Finance findBySku(String sku);
}
