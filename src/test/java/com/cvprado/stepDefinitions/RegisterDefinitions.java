package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.HomePage;
import com.cvprado.opencart_pages.RegisterPage;
import com.cvprado.opencart_pages.SuccessAccountPage;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class RegisterDefinitions {
    private HomePage homePage;
    private RegisterPage registerPage;
    private SuccessAccountPage successAccountPage;


    Faker faker = new Faker();

    public void RegisterDefinition(){
        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.successAccountPage = new SuccessAccountPage(Hooks.getDriver());
    }

    @Y("entra a la página de registro")
    public void entraALaPáginaDeRegistro(){
        homePage.ingresarRegister();

    }


    @Cuando("ingresa cada uno de los datos requeridos y presiona continuar")
    public void ingresaCadaUnoDeLosDatosRequeridosYPresionaContinuar() {
        registerPage.LlenarForm(faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());
    }




    @Entonces("debería ingresar a la página de mi cuenta y ver un mensaje de exito")
    public void deberiaIngresarALaPaginaDeMiCuentaYVerUnMensajeDeExito() {
        Assert.assertEquals(successAccountPage.getTitle(),"Account");
        Assert.assertTrue(successAccountPage.textEsVisible());
    }
}