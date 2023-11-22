package com.cvprado.openCart;

import com.cvprado.opencart_pages.*;
import org.testng.annotations.Test;

public class WishListTest extends BaseTest{

    @Test
    public void validarAddWishList(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        WishListPage wishListPage = new WishListPage(getDriver());

        //Punto 1
        getDriver().get("https://opencart.abstracta.us/");

        // Punto 2 y 3
        homePage.ingresarLogin();

        //Punto 4

        loginPage.login("testopencart@gmail.com", "1234");

        //Punto 5
        myAccountPage.ingresarSeccionCameras();
        addToCartPage.verModoLista();
        addToCartPage.productIsPresent();
        addToCartPage.addToWishList();
        addToCartPage.ingresarWishList();
        wishListPage.getTitulo();
        wishListPage.validarWishList();
    }
}
