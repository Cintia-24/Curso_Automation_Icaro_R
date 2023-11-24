package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void LlenarForm(String nombre, String apellido, String email,String telefono, String password) {

        sendKeys(nameInput,nombre);
        sendKeys(lastnameInput,apellido);
        sendKeys(emailInput,email);
        sendKeys(telInput,telefono);
        sendKeys(passInput,password);
        sendKeys(confirmpassInput,password);

        click(agreeBtn);
        click(continueBtn);

    }

}