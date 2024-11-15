package com.example.n01561393_Assignment06_Transaction_Finance_Service.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class ApplicationConfig {

    @Value("${taxes.provincial}")
    private String provincial;

    @Value("${taxes.federal}")
    private String federal;
}
