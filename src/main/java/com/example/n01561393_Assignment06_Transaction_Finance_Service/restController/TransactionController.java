package com.example.n01561393_Assignment06_Transaction_Finance_Service.restController;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.config.ApplicationConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    private final ApplicationConfig applicationConfig;

    public TransactionController(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
    }

    @GetMapping
    public String getConfigData(){
        System.out.println("Provinsial text:" + applicationConfig.getProvincial());
        System.out.println("Federal text:" + applicationConfig.getFederal());

        return "Data fetched!!";
    }
}
