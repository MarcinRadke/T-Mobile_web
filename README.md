# T-Mobile Web E2E Test Suite

[![Java](https://img.shields.io/badge/Java-26-orange)](https://openjdk.java.net/)
[![Maven](https://img.shields.io/badge/Maven-3.8+-blue)](https://maven.apache.org/)
[![Selenide](https://img.shields.io/badge/Selenide-7.4.2-green)](https://selenide.org/)
[![Cucumber](https://img.shields.io/badge/Cucumber-7.34.3-brightgreen)](https://cucumber.io/)

## 📋 Description

This project contains end-to-end (E2E) automated tests for the T-Mobile Poland website, specifically focusing on the shopping functionality. The test suite validates the complete flow of adding a phone to the shopping cart, ensuring price consistency and proper cart functionality.

## ✨ Features

- **Automated E2E Testing**: Complete browser automation for T-Mobile shopping flow
- **Price Validation**: Ensures product prices match between product page and cart
- **BDD Approach**: Uses Cucumber for behavior-driven development
- **Page Object Model**: Clean, maintainable code structure with separate page objects

## 🛠 Technologies Used

- **Java**: Programming language
- **Maven**: Build automation and dependency management
- **Selenide**: WebDriver wrapper for concise web tests
- **Cucumber**: BDD testing framework
- **JUnit**: Testing framework

## 📋 Prerequisites

Before running this project, ensure you have the following installed:

- **Java 26** or higher
- **Maven 3.8+**
- **WebDriver**: Automatically managed by Selenide (ChromeDriver recommended)

## 🚀 Installation

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd T-Mobile_web
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

## 🧪 Running Tests

### Run all tests:
```bash
mvn test
```

## 📁 Project Structure

```
T-Mobile_web/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── com/example/E2E/
│       │       ├── TestRunner.java          # Cucumber test runner
│       │       ├── TestScenarios/
│       │       │   └── ShopSteps.java       # Step definitions
│       │       └── utils/                   # Page Object classes
│       │           ├── HomePage.java
│       │           ├── ShopPage.java
│       │           ├── ProductPage.java
│       │           └── CartPage.java
│       └── resources/
│           └─ Features/
│               └── Shop.feature             # Cucumber feature files
├── target/                  # Build output and reports
├── pom.xml                  # Maven configuration
└── README.md                # This file
```

## 🧩 Test Scenarios

### Current Test Case: Adding Phone to Cart

1. Open browser and navigate to T-Mobile Poland website
2. Accept cookies
3. Navigate to "Sklep" (Shop) section
4. Select "Bez abonamentu" (No contract) phones
5. Choose a specific device (e.g., Huawei Watch FIT 4 Pro)
6. Add device to cart and validate price consistency
7. Return to main page and open cart
8. Verify device is in the shopping cart

---

**Author:** Marcin Radke
**Date:** 07.05.2026
