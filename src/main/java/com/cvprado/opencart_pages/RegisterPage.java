package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    By title = By.xpath("//h1[text()='Account']");
    By nameInput = By.id("input-firstname");
    By lastnameInput = By.id("input-lastname");
    By emailInput = By.id("input-email");
    By telInput = By.id("input-telephone");

    By passInput = By.id("input-password");
    By confirmpassInput = By.id("input-confirm");

    By agreeBtn = By.name("agree");

    By continueBtn = By.xpath("//input[@type='submit']");



    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void LlenarForm(String name, String lastname, String email,String telefono, String password) {

        WebElement nameInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(nameInput));
        nameInputElement.sendKeys(name);

        WebElement lastnameInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(lastnameInput));
        lastnameInputElement.sendKeys(lastname);

        WebElement emailInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailInputElement.sendKeys(email);

        WebElement telephoneInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(telInput));
        telephoneInputElement.sendKeys(telefono);

        WebElement passInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passInput));
        passInputElement.sendKeys(password);

        WebElement confirmpassInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmpassInput));
        confirmpassInputElement.sendKeys(password);

        WebElement agreeBtnElement = wait.until(ExpectedConditions.elementToBeClickable(agreeBtn));
        agreeBtnElement.click();

        WebElement continueBtnElement = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtnElement.click();
    }


}
