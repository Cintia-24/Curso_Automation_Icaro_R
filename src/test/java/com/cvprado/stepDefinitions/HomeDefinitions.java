package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class HomeDefinitions {
    private final HomePage homePage;

    public HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la pagina de Opencart")
    public void queElUsuarioIngresaALaPaginaDeOpencart() {
        //System.out.println("STEP DADO");
        Hooks.getDriver().get(Hooks.getConfigValue("url"));
    }
    @Entonces("se valida que le usuario se encuentra en la home")
    public void seValidaQueLeUsuarioSeEncuentraEnLaHome() {
        //System.out.println("STEP ENTONCES");
        Assert.assertEquals(homePage.getTitulo(),"Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carruselEsVisible());
    }

    @Y("el usuario ingresa al login")
    public void elUsuarioIngresaAlLogin() {
        homePage.ingresarLogin();
    }
}
    //        HomePage homePage = new HomePage(getDriver());
    //
    //        getDriver().get("https://opencart.abstracta.us/");
    //
    //        Assert.assertEquals(homePage.getTitulo(),"Your Store");
    //        Assert.assertTrue(homePage.buscadorEsVisible());
    //        Assert.assertTrue(homePage.carruselEsVisible());
    //    }

