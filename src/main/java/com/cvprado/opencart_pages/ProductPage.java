package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    private By inputSelect = By.id("input-option226");
    private By optionSelect = By.xpath("//option[@value='16']");
    private By addToCartBtn = By.id("button-cart");

    private By CartBtn = By.id("cart");
    private By viewCartBtn = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong");

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectOptionAndAdd(){
        WebElement inputSelectElement = wait.until(ExpectedConditions.elementToBeClickable(inputSelect));
        inputSelectElement.click();

        WebElement optionSelectElement = wait.until(ExpectedConditions.elementToBeClickable(optionSelect));
        optionSelectElement.click();

        WebElement addToCartBtnElement = wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        addToCartBtnElement.click();
    }
    public void clickCart(){
        WebElement CartBtnElement = wait.until(ExpectedConditions.elementToBeClickable(CartBtn));
        CartBtnElement.click();
    }

    public void viewCart(){
        WebElement viewCartBtnElement = wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn));
        viewCartBtnElement.click();
    }
}
