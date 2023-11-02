package com.cvprado.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends BaseTest{
    @Test
    public void validarHome(){
        getDriver().get("https://opencart.abstracta.us/");

        By title = By.xpath("//div[@id='logo']/h1/a");
        By search = By.name("search");
        By carrousel = By.id("slideshow0");

        WebElement titleElement = this.getDriver().findElement(title);
        WebElement searchElement = this.getDriver().findElement(search);
        WebElement carrouselElement = this.getDriver().findElement(carrousel);


        //WebElement titleElement = this.driver.findElement("//div[@id='logo']/h1/a");
        //WebElement searchElement = this.driver.findElement("search");
        //WebElement carrouselElement = this.driver.findElement("slideshow0");
        //Se puede escribir asi para no tener tanto codigo y podes sacar los By, no definir variables.

        Assert.assertEquals(titleElement.getText(),"Your Store");
        Assert.assertTrue(searchElement.isDisplayed());
        Assert.assertTrue(carrouselElement.isDisplayed());
    }


}
