package com.example.n01561393_Assignment06_Transaction_Finance_Service.restController;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.entity.Finance;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.service.FinanceService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/finance/{sku}")
    public Finance getFinanceById(@PathVariable String sku) {
        return financeService.getFinanceBySku(sku);
    }

    @PostMapping("/addFinance")
    public String addFinace(@RequestBody Finance finance) {
        financeService.addFinance(finance);
        return "Finance is added Successfully !!";
    }


}
