package com.cvprado.openCart;

import com.cvprado.opencart_pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


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
