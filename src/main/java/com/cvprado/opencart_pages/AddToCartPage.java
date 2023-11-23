package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends BasePage {

    private final By imgProduct = By.xpath("//img[@title='Canon EOS 5D' and @class='img-responsive']");
    private final By listViewBtn = By.id("list-view");

    private final By addWishListBtn = By.xpath("//button[contains(@data-original-title, 'Add to Wish List')]");

    private final By wishListBtn = By.xpath("//a [contains (@href,\"account/wishlist\")]");


    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public void verModoLista(){
        click(listViewBtn);
    }

    public boolean productIsPresent(){
        return isDisplayed(imgProduct);
    }

    public void addToWishList(){
        click(addWishListBtn);
    }

    public void ingresarWishList(){
        click(wishListBtn);
    }
}