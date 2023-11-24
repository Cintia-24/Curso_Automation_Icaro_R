package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage {

    private By title = By.xpath("//h1[text()='Account']");
    private By nameInput = By.id("input-firstname");
    private By lastnameInput = By.id("input-lastname");
    private By emailInput = By.id("input-email");
    private By telInput = By.id("input-telephone");

    private By passInput = By.id("input-password");

    private By confirmpassInput = By.id("input-confirm");

    private By agreeBtn = By.name("agree");

    private By continueBtn = By.xpath("//input[@type='submit']");

    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void LlenarForm(String name, String lastname, String email,String telefono, String password) {

        sendKeys(nameInput,name);
        sendKeys(lastnameInput,lastname);
        sendKeys(emailInput,email);
        sendKeys(telInput,telefono);
        sendKeys(passInput,password);

        //WebElement confirmpassInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmpassInput));
        //confirmpassInputElement.sendKeys(password);

        click(agreeBtn);
        click(continueBtn);

    }
}