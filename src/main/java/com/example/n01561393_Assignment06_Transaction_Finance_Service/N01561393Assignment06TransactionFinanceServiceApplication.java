package com.example.n01561393_Assignment06_Transaction_Finance_Service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//OpenAPI provides a clear way to describe the API, making it easier to use,
// and the dependency helps automatically generate that description for the
// Java Spring applications. This makes the API more user-friendly for other developers!
@OpenAPIDefinition(
		info = @Info(
				title = "Transaction Finance Service API",
				version = "1.0",
				description = "API for managing financial details related to transactions."
		)
)
public class N01561393Assignment06TransactionFinanceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(N01561393Assignment06TransactionFinanceServiceApplication.class, args);
	}

}
