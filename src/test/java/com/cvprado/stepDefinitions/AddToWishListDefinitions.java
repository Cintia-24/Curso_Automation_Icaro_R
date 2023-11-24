package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class AddToWishListDefinitions {
    private final HomePage homePage;
    private final AddToCartPage addToCartPage;
    private final LoginPage loginPage;
    private final MyAccountPage myAccountPage;
    private final WishListPage wishListPage;

    public AddToWishListDefinitions() {
        this.addToCartPage = new AddToCartPage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.homePage = new HomePage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.wishListPage = new WishListPage(Hooks.getDriver());
    }

    @Dado("que el usuario se encuentra en la pagina del producto que desea")
    public void queElUSuarioSeEncuentraEnLaPaginaDelProductoQueDesea(){
        Hooks.getDriver().get(Hooks.getConfigValue("url"));
        homePage.ingresarLogin();
        loginPage.login(Hooks.getConfigValue("username"), Hooks.getConfigValue("password"));
        myAccountPage.ingresarSeccionCameras();
    }

    @Cuando("hace click en el boton de Agregar a Favoritos")
    public void haceClickenElBotonDeAgregarAFavoritos() {
        addToCartPage.verModoLista();
        addToCartPage.productIsPresent();
        addToCartPage.addToWishList();
    }

    @Entonces("deberia validar que el producto se agrego a Favoritos")
    public void deberiaValidarQueElProductoSeAgregoAFavoritos() {
        addToCartPage.ingresarWishList();
        Assert.assertEquals(wishListPage.getTitulo(),"Account");
        Assert.assertTrue(wishListPage.imgEsVisible());
    }
}
