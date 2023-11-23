package com.cvprado.openCart;

import com.cvprado.opencart_pages.HomePage;
import com.cvprado.opencart_pages.RegisterPage;
import com.cvprado.opencart_pages.SuccessAccountPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void createAccount(){
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        SuccessAccountPage successAccountPage = new SuccessAccountPage(getDriver());

        Faker faker = new Faker();

        //1)
        getDriver().get("https://opencart.abstracta.us/");

        //2 y 3)
        homePage.ingresarRegister();

        //4)
        //registerPage.LlenarForm("Arturo","Virgolini","aavirgo@gmail.com","56558768","1234");
        registerPage.LlenarForm(faker.name().firstName(),
                                faker.name().lastName(),
                                faker.internet().emailAddress(),
                                faker.phoneNumber().phoneNumber(),
                                faker.internet().password());




        Assert.assertEquals(successAccountPage.getTitle(),"Account");

        Assert.assertTrue(successAccountPage.textEsVisible());

    }




}
