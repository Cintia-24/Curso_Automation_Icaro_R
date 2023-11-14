package com.cvprado.openCart;

import com.cvprado.opencart_pages.HomePage;
import com.cvprado.opencart_pages.LoginPage;
import com.cvprado.opencart_pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validarLogin() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //Punto 1
        getDriver().get("https://opencart.abstracta.us/");

        // Punto 2 y 3
        homePage.ingresarLogin();

        //Punto 4

        loginPage.login("testopencart@gmail.com", "1234");

        //Punto 5
        myAccountPage.getTitulo();

        Assert.assertEquals(myAccountPage.getTitulo(),"My Account");
    }

    @Test
    public void loginFallido() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //Punto 1
        getDriver().get("https://opencart.abstracta.us/");

        // Punto 2 y 3
        homePage.ingresarLogin();

        //Punto 4

        loginPage.login("testopencart@gmail.com", "1235");

        //Punto 5



    }
}
