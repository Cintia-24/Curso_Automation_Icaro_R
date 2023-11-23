package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SuccessAccountPage extends BasePage{

    private By title = By.xpath("//h1[text()='Account']");

   private By text = By.xpath("//*[contains(text(),'Congratulations')]");


    public SuccessAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getText(title);
    }

    public Boolean textEsVisible() {
        return isDisplayed(text);
    }
}