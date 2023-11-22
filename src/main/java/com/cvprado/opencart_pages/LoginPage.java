package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginForm = By.xpath("//input[@class='btn btn-primary']");
    //  //input[@type='submit' and @value='Login'] opcion mas robusta de xpath

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String email, String password){
        WebElement emailInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailInputElement.sendKeys(email);
        WebElement passwordInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passwordInputElement.sendKeys(password);
        WebElement loginFormElement = wait.until(ExpectedConditions.elementToBeClickable(loginForm));
        loginFormElement.click();
    }
}
