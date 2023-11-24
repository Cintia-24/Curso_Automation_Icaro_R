package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SuccessAccountPage extends BasePage{

    private By title = By.xpath("//div[@id='content']/h1");

   private final By succestext = By.xpath("//*[contains(text(),'Congratulations')]");


    public SuccessAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getText(title);
    }

    public Boolean textEsVisible() {
        return Displayed(succestext);
    }
}