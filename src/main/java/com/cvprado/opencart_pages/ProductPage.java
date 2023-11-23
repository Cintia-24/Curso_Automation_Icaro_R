package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    private By inputSelect = By.id("input-option226");
    private By optionSelect = By.xpath("//option[@value='16']");
    private By addToCartBtn = By.id("button-cart");

    private By CartBtn = By.id("cart");
    private By viewCartBtn = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectOptionAndAdd() {
        click(inputSelect);
        click(optionSelect);
        click(addToCartBtn);
    }


    public void clickCart(){
        click(CartBtn);
    }

    public void viewCart(){
        click(viewCartBtn);
    }
}
