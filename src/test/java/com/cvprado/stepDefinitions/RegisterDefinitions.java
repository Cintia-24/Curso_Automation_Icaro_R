package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.HomePage;
import com.cvprado.opencart_pages.RegisterPage;
import com.cvprado.opencart_pages.SuccessAccountPage;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

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

    //@Cuando("ingresa cada uno de los datos requeridos y presiona continuar")
    //public void ingresaCadaUnoDeLosDatosRequeridosYPresionaContinuar() {
        //registerPage.LlenarForm(faker.name().firstName(),
               // faker.name().lastName(),
               // faker.internet().emailAddress(),
               // faker.phoneNumber().phoneNumber(),
                //faker.internet().password());

        //registerPage.LlenarForm();


    @Entonces("debería ingresar a la página de mi cuenta y ver un mensaje de exito")
    public void deberiaIngresarALaPaginaDeMiCuentaYVerUnMensajeDeExito() {
        Assert.assertEquals(successAccountPage.getTitle(),"Account");
        Assert.assertTrue(successAccountPage.textEsVisible());
    }

    @Cuando("el usuario se registra con nombre {string}, apellido {string}, email {string}, telefono {string}, password {string}")
    public void elUsuarioSeRegistraConNombreApellidoEmailTelefonoPassword(String nombre,
                                                                          String apellido,
                                                                          String email,
                                                                          String telefono,
                                                                          String password) {
        registerPage.LlenarForm(nombre,apellido,email, telefono,password);

    }

    @Entonces("se verifica que la cuenta se creo correctamente")
    public void seVerificaQueLaCuentaSeCreoCorrectamente() {
        Assert.assertEquals(successAccountPage.getTitle(),"Account");
        Assert.assertTrue(successAccountPage.textEsVisible());
    }

    @Cuando("el usuario se registra con los siguientes datos")
    public void elUsuarioSeRegistraConLosSiguientesDatos(DataTable dataTable) {
        List<Map<String,String>> data = dataTable.asMaps();

        for(Map<String,String> mapa :data ){
            System.out.println(mapa);

            String nombre = mapa.get("nombre");
            String email = mapa.get("email");

            //acá no genera los test sino que me imprime un listado que me muestra los datos de la tabla
            // y la última parte me recupera cada uno de los datos de una fila
        }
    }

    //@Entonces("se verifica el mensaje de error {string}")
    //public void seVerificaElMensajeDeError(String mensaje) {
        //Assert.assertEquals(registerPage.getMensajeDeError(), mensaje);
    //}
}