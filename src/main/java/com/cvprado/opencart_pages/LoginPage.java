package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    private By emailInput = By.id("input-email");
    private By passwordInput = By.id("input-password");
    private By loginForm = By.xpath("//input[@class='btn btn-primary']");
    //  //input[@type='submit' and @value='Login'] opcion mas robusta de xpath


    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password){
        sendKeys(emailInput,email);
        sendKeys(passwordInput,password);
        click(loginForm);
    }
}
