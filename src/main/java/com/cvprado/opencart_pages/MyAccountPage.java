package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MyAccountPage extends BasePage{
    private final By myAccountTitle = By.xpath("//h2 [text()='My Account']");

    private final By cameraBtn = By.xpath("//a[contains (@href,\"product/category&path=33\")]");

    private final By cameraProduct =By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
    // tiene nombre pero si lo uso no lo encuentra. y falla el test.


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getTitulo(){
        return getText(myAccountTitle);
    }

    public void ingresarSeccionCameras(){
        click(cameraBtn);
    }

    public void selectProduct(){
        click(cameraProduct);
    }
}
