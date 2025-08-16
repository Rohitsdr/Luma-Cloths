# LumaCloths

LumaCloths is a Java automation project that uses Selenium WebDriver to automate interactions with the [Magento Luma Demo Site](https://magento.softwaretestingboard.com/).

## Features

- Automates navigation and product selection on the Luma demo site
- Selects product categories, applies filters, and adds items to the cart
- Fills in customer details for checkout

## Project Structure

```
LumaCloths/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Check_Up/
│   │           └── LumaSite.java
│   └── test/
│       └── java/
└── target/
```

## Prerequisites

- Java 8 or higher
- Maven
- [GeckoDriver](https://github.com/mozilla/geckodriver/releases) (for Firefox)
- Firefox browser

## Setup

1. Clone the repository.
2. Ensure GeckoDriver is installed and available in your system PATH.
3. Install dependencies:

   ```sh
   mvn clean install
   ```

## Running the Automation

You can run the main class using Maven or your IDE:

```sh
mvn exec:java -Dexec.mainClass="Check_Up.LumaSite"
```

Or run it directly from your IDE by executing the `main` method in [`Check_Up.LumaSite`](src/main/java/Check_Up/LumaSite.java).

## Dependencies

- [Selenium Java 4.26.0](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.26.0)

## License

This project is for educational and demonstration purposes .
