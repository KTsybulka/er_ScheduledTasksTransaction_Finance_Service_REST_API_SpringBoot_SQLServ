package com.example.n01561393_Assignment06_Transaction_Finance_Service.scheduler;

import com.example.n01561393_Assignment06_Transaction_Finance_Service.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class TrasactionScheduler {

    private final TransactionService transactionService;

    public TrasactionScheduler(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

//    the task runs every 2 minutes
    @Scheduled(cron = "0 */1 * * * *")
    public void updateDataBase(){
        log.info("Job starered");
        List<String> skus = Arrays.asList("1001", "1002", "1003");

        for(String sku : skus){
            transactionService.addRecord(sku);
        }

        log.info("Job completed");
    }
}
