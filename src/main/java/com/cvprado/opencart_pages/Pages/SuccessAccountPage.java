package com.cvprado.opencart_pages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SuccessAccountPage {

    By title = By.xpath("//h1[text()='Account']");

    By text = By.xpath("//*[contains(text(),'Congratulations')]");


    WebDriver driver;
    WebDriverWait wait;

    public SuccessAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitle() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElement.getText();
    }

    public Boolean textEsVisible() {
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(text));
        return textElement.isDisplayed();
    }
}