package com.cvprado.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class LoginTest extends BaseTest {

    @Test
    public void validarLogin() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        By myAccountBtn = By.xpath("//a [@title='My Account']");
        ////a[contains(@href,'account/login')]
        By loginBtn = By.xpath("//a[text()='Login']");

        getDriver().get("https://opencart.abstracta.us/");

        WebElement myAccountElement = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountElement.click();

        WebElement loginBtnElement = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtnElement.click();

        By emailInput = By.id("input-email");
        By passwordInput = By.id("input-password");
        By loginForm = By.xpath("//input[@class='btn btn-primary']");
        //  //input[@type='submit' and @value='Login'] opcion mas robusta de xpath

        WebElement emailInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
        emailInputElement.sendKeys("testopencart@gmail.com");
        WebElement passwordInputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passwordInputElement.sendKeys("1234");
        WebElement loginFormElement = wait.until(ExpectedConditions.elementToBeClickable(loginForm));
        loginFormElement.click();

        By myAccountTitle = By.xpath("//h2 [text()='My Account']");

        WebElement myAccountTitleElement = wait.until(presenceOfElementLocated(myAccountTitle));

        Assert.assertEquals(myAccountTitleElement.getText(),"My Account");
    }

}
