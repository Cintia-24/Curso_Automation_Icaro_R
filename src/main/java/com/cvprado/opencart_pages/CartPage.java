package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private By inputQuantity = By.xpath("//input[@class='form-control']");
    // tiene nombre pero si lo utilizo el test falla.

    private By tableCart = By.xpath("//div[@class='table-responsive']");

    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public Boolean tableEsVisible() {
        WebElement tableCartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(tableCart));
        return tableCartElement.isDisplayed();
    }
    public boolean quantityIsVisible(){
        WebElement inputQuantityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(inputQuantity));
        return inputQuantityElement.isDisplayed();
    }
}
