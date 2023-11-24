package com.cvprado.stepDefinitions;

import com.cvprado.hooks.Hooks;
import com.cvprado.opencart_pages.CartPage;
import com.cvprado.opencart_pages.MyAccountPage;
import com.cvprado.opencart_pages.ProductPage;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class AddToCartDefinitions {
    private MyAccountPage myAccountPage;
    private ProductPage productPage;
    private CartPage cartPage;


    public AddToCartDefinitions() {
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
        this.productPage = new ProductPage(Hooks.getDriver());
        this.cartPage = new CartPage(Hooks.getDriver());
    }

    @Cuando("hace click en el boton de Agregar al Carrito")
    public void haceClickEnElBotonDeAgregarAlCarrito(){
        myAccountPage.selectProduct();
        productPage.selectOptionAndAdd();
    }


    @Entonces("deberia validar que el producto se agrego con exito al Carrito")
    public void deberiaValidarQueElProductoSeAgregoConExitoAlCarrito() {
        productPage.clickCart();
        productPage.viewCart();

        Assert.assertTrue(cartPage.tableEsVisible());
        Assert.assertTrue(cartPage.quantityIsVisible());
    }
}
