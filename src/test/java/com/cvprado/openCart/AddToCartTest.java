package com.cvprado.openCart;

import com.cvprado.opencart_pages.*;
import org.checkerframework.checker.units.qual.Temperature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{

    @Test
    public void addProductToCart(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        ProductPage productPage = new ProductPage(getDriver());
        CartPage cartPage = new CartPage(getDriver());

        //Punto 1
        getDriver().get("https://opencart.abstracta.us/");

        // Punto 2
        homePage.ingresarLogin();
        loginPage.login("testopencart@gmail.com", "1234");

        //Punto 3
        myAccountPage.ingresarSeccionCameras();

        //Punto 4
        myAccountPage.selectProduct(); //generar un metodo que el elemento sea solo visible no clicable

        //Punto 5
        productPage.selectOptionAndAdd();

        //Punto 6
        productPage.clickCart();

        //Punto 7
        productPage.viewCart();

        //Punto 8

        Assert.assertTrue(cartPage.tableEsVisible());
        Assert.assertTrue(cartPage.quantityIsVisible());
    }

}
//4)Click en Canon EOS 5D
//5) Seleccionar una opción y agregar el producto al carrito
//6) Click en el carrito
//7) Click en View Cart
//8) Validar que el producto se encuentre en el carrito (realice las validaciones que
//considere necesario