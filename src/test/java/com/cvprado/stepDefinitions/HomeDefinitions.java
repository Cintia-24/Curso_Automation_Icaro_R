package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class HomeDefinitions {
    HomePage homePage;

    public HomeDefinitions(HomePage homePage) {
        this.homePage = homePage;
    }

    @Dado("que el usuario ingresa a la pagina de Opencart")
    public void queElUsuarioIngresaALaPaginaDeOpencart() {
        //System.out.println("STEP DADO");
        Hooks.getDriver().get("https://opencart.abstracta.us/");
    }
    @Entonces("se valida que le usuario se encuentra en la home")
    public void seValidaQueLeUsuarioSeEncuentraEnLaHome() {
        //System.out.println("STEP ENTONCES");
        Assert.assertEquals(homePage.getTitulo(),"Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carruselEsVisible());
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
