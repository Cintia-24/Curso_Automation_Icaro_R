package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {
    By myAccountTitle = By.xpath("//h2 [text()='My Account']");

    WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitulo(){
        WebElement myAccountTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountTitle));
        return myAccountTitleElement.getText();
    }


}
