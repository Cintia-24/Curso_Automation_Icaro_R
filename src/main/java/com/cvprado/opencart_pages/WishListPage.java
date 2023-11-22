package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage {

    private final By title = By.xpath("//*[@id=\"content\"]/h2");
    private final By productImg = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[1]/a/img");

    WebDriver driver;
    WebDriverWait wait;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public String getTitulo() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElement.getText();
    }
    public boolean imgEsVisible(){
        WebElement productImgElement = wait.until(ExpectedConditions.visibilityOfElementLocated (productImg));
        return productImgElement.isDisplayed();
    }
}
