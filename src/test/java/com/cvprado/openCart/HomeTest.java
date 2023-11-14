package com.cvprado.openCart;

import com.cvprado.opencart_pages.HomePage;
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
        HomePage homePage = new HomePage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");

        Assert.assertEquals(homePage.getTitulo(),"Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carruselEsVisible());
    }
}
