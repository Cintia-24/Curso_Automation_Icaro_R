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

    By registerBtn = By.xpath("//a [contains (@href,\"account/register\")]");

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ingresarLogin() {
        WebElement myAccountElement = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountElement.click();

        WebElement loginBtnElement = wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtnElement.click();
    }
    public void ingresarRegister() {
        WebElement myAccountElement = wait.until(ExpectedConditions.elementToBeClickable(myAccountBtn));
        myAccountElement.click();

        WebElement registerBtnElement = wait.until(ExpectedConditions.elementToBeClickable(registerBtn));
        registerBtnElement.click();
    }




    //public void validarHome(){

    //WebElement titleElement = this.getDriver().findElement(title);
    //WebElement searchElement = this.getDriver().findElement(search);
    //WebElement carrouselElement = this.getDriver().findElement(carrousel);


    //WebElement titleElement = this.driver.findElement("//div[@id='logo']/h1/a");
    //WebElement searchElement = this.driver.findElement("search");
    //WebElement carrouselElement = this.driver.findElement("slideshow0");
    //Se puede escribir asi para no tener tanto codigo y podes sacar los By, no definir variables.

    //Assert.assertEquals(titleElement.getText(),"Your Store");
    //Assert.assertTrue(searchElement.isDisplayed());
    //Assert.assertTrue(carrouselElement.isDisplayed());

    //es una manera de abstraer pero que no es correcta a mmenos que trabajemos con cucumber.
    //}

    public String getTitulo() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElement.getText();
    }

    public Boolean buscadorEsVisible() {
        WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        return searchElement.isDisplayed();
    }

    public Boolean carruselEsVisible() {
        WebElement carrouselElement = wait.until(ExpectedConditions.visibilityOfElementLocated(carrousel));
        return carrouselElement.isDisplayed();
    }

    //WebElement titleElement = this.driver.findElement("//div[@id='logo']/h1/a");
    //WebElement searchElement = this.driver.findElement("search");
    //WebElement carrouselElement = this.driver.findElement("slideshow0");
    //Se puede escribir asi para no tener tanto codigo y podes sacar los By, no definir variables.
}
