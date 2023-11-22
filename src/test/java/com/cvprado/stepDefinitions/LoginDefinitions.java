package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.LoginPage;
import com.cvprado.opencart_pages.MyAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LoginDefinitions {
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }


    @Cuando("el usuario ingresa credenciales validas")
    public void elUsuarioIngresaCredencialesValidas() {
        loginPage.login("testopencart@gmail.com", "1234");

    }

    @Entonces("se valida que el usuario se encuentra en su cuenta")
    public void seValidaQueElUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertEquals(myAccountPage.getTitulo(),"My Account");
    }
}
