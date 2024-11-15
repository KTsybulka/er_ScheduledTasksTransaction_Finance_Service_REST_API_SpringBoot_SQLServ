package com.example.n01561393_Assignment06_Transaction_Finance_Service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Data
@ConfigurationProperties(prefix = "canada-taxes")
public class CanadaTaxConfig {
    private Map<String,CanadaTax> taxMap;

}
