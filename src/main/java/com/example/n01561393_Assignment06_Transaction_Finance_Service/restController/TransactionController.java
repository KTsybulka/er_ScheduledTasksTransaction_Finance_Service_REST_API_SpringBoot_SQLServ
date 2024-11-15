package com.example.n01561393_Assignment06_Transaction_Finance_Service.restController;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.config.ApplicationConfig;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.config.CanadaTax;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.config.CanadaTaxConfig;
import com.example.n01561393_Assignment06_Transaction_Finance_Service.config.SkuDescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TransactionController {

    private final ApplicationConfig applicationConfig;
    private final CanadaTaxConfig canadaTaxConfig;

    public TransactionController(ApplicationConfig applicationConfig, CanadaTaxConfig canadaTaxConfig) {
        this.applicationConfig = applicationConfig;
        this.canadaTaxConfig = canadaTaxConfig;
    }

    @GetMapping
    public String getConfigData(){
        System.out.println("Provinsial text:" + applicationConfig.getProvincial());
        System.out.println("Federal text:" + applicationConfig.getFederal());

        System.out.println("------------------------");

        for(String day: applicationConfig.getDays()){
            System.out.println("Day :"+day);
        }

        System.out.println("------------------------");

        for(SkuDescription sku: applicationConfig.getSkuList()){
            System.out.println("sku :"+sku.getSku());
            System.out.println("sku :"+sku.getDescription());
        }

        System.out.println("------------------------");

        for(Map.Entry<String, CanadaTax> entry : canadaTaxConfig.getTaxMap().entrySet()){
            System.out.println("Province Name :"+ entry.getKey());
            System.out.println("Taxes :" + entry.getValue());
        }

        System.out.println("------------------------");

        System.out.println("Appliction name: " + applicationConfig.getApplicationName());

        return "Data fetched!!";
    }
}
