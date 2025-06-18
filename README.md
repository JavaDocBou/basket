# Shopping Cart Calculation Project - Technical Test

## Description
This project implements a system to calculate the cost of a shopping cart containing products (premium phones, standard phones, and laptops) for different types of customers (individuals and professionals) according to the provided specifications. It is developed in Java using the Spring Boot framework for a modular and extensible structure.

## Features
- Management of two customer types:
  - Individuals (identified by ID, first name, and last name).
  - Professionals (identified by ID, company name, SIREN, annual revenues, and optional VAT number).
- Standard pricing for individuals:
  - Premium phone: 1500 €
  - Standard phone: 800 €
  - Laptop: 1200 €
- Fixed pricing for professionals based on annual revenues:
  - Annual revenues > 10,000,000 €: 1000 €, 550 €, and 900 € respectively.
  - Annual revenues < 10,000,000 €: 1150 €, 600 €, and 1000 € respectively.
- Calculation of the total cart cost with multiple units of each product.

## Prerequisites
- Java 17 or higher
- Maven 3.x
- Recommended IDE: IntelliJ IDEA or Eclipse (optional)

## Installation and Execution
1. Clone the repository (https://github.com/JavaDocBou/basket/tree/dev) or unzip the project files.
2. Ensure Maven is installed (`mvn -version` to verify).
3. From the root directory, run:
   ```bash
   mvn spring-boot:run
   
## Running tests
   ```bash
   mvn test
