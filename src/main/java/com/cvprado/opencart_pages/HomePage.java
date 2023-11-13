package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    By title = By.xpath("//div[@id='logo']/h1/a");
    By search = By.name("search");
    By carrousel = By.id("slideshow0");

    By myAccountBtn = By.xpath("//a [@title='My Account']");
    ////a[contains(@href,'account/login')]
    By loginBtn = By.xpath("//a[text()='Login']");

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void ingresarLogin(){
        WebElement myAccountElement = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountElement.click();

        WebElement loginBtnElement = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtnElement.click();
    }

    

}
