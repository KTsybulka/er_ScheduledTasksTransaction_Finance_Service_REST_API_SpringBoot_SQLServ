# Transaction Finance Service API

This project is a **Transaction Finance Service API** built with **Spring Boot**. The API is designed to manage and provide financial details of sales transactions, integrating with other services for complete order tracking and inventory updates.

## Features

- **Retrieve Finance Details**: Provides transaction details such as ID, SKU, and price.
- **Integrated Data Retrieval**: Connects with the Sales Order Tracker to store and retrieve price and quantity data.
- **Scheduled Updates**: Periodically updates SKU price and quantity based on data defined in `application.yml`.

## Technology Stack

- **Spring Boot**: Framework for building the API.
- **SQL Server**: Database for storing transaction data.
- **Spring Data JPA**: Manages data persistence.
- **Lombok**: Simplifies Java code by auto-generating boilerplate code.
- **Swagger (OpenAPI)**: Provides interactive API documentation.
- **Scheduled Tasks**: Updates SKU data at defined intervals.

## Endpoints

- **Get Finance Detail**: Retrieve financial details (ID, SKU, Price) for a specified SKU.
  - **Endpoint**: `GET /finance/{sku}`
- **Order Data Retrieval**: Access stored transaction data, including SKU, quantity, price, and timestamp.
  - **Endpoint**: `GET /order-tracker`
- **Quantity and Price Lookup**: Retrieves quantity and price for a specified SKU.
  - **Endpoint**: `GET /order-tracker/{sku}`

## Scheduled Job

A scheduled task runs every 2 minutes to update the price and quantity for each SKU listed in the `application.yml` configuration. This ensures data is current and reflective of any recent inventory or price changes.

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/KTsybulka/er_ScheduledTasksTransaction_Finance_Service_REST_API_SpringBoot_SQLServ.git
   cd Transaction_Finance_Service
