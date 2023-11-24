package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends BasePage{

    private By inputQuantity = By.xpath("//input[@class='form-control']");
    // tiene nombre pero si lo utilizo el test falla.

    private By tableCart = By.xpath("//div[@class='table-responsive']");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public Boolean tableEsVisible() {
        return Displayed(tableCart);
    }
    public boolean quantityIsVisible(){
        return Displayed(inputQuantity);
    }
}
