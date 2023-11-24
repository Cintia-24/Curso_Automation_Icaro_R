package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WishListPage extends BasePage{

    private final By title = By.xpath("//*[@id=\"content\"]/h2");
    private final By productImg = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[1]/a/img");


    public WishListPage(WebDriver driver) {

        super(driver);
    }
    public String getTitulo() {

        return getText(title);
    }
    public boolean imgEsVisible(){

        return Displayed(productImg);
    }
}
