package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private By title = By.xpath("//div[@id='logo']/h1/a");
    private By search = By.name("search");
    private By carrousel = By.id("slideshow0");

    private By myAccountBtn = By.xpath("//a [@title='My Account']");
    ////a[contains(@href,'account/login')]
    private By loginBtn = By.xpath("//a[text()='Login']");

    private By registerBtn = By.xpath("//a [contains (@href,\"account/register\")]");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ingresarLogin() {
        click(myAccountBtn);
        click(loginBtn);
    }
    public void ingresarRegister() {
        click(myAccountBtn);
        click(registerBtn);
    }

    public String getTitulo() {
        return getText(title);
    }

    public Boolean buscadorEsVisible() {
        return isDisplayed(search);
    }

    public Boolean carruselEsVisible() {
        return isDisplayed(carrousel);
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



    //WebElement titleElement = this.driver.findElement("//div[@id='logo']/h1/a");
    //WebElement searchElement = this.driver.findElement("search");
    //WebElement carrouselElement = this.driver.findElement("slideshow0");
    //Se puede escribir asi para no tener tanto codigo y podes sacar los By, no definir variables.
}
