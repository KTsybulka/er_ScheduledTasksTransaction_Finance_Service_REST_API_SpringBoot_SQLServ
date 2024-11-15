package com.example.n01561393_Assignment06_Transaction_Finance_Service.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties(prefix = "application-config")
@Configuration
@Data
public class ApplicationConfig {

    @Value("${taxes.provincial}")
    private String provincial;

    @Value("${taxes.federal}")
    private String federal;

    private List<String> days;

    private List<SkuDescription> skuList;

    @Value("${application.name}")
    private String applicationName;

}
