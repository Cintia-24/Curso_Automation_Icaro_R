package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {
    private final By myAccountTitle = By.xpath("//h2 [text()='My Account']");

    private final By cameraBtn = By.xpath("//a[contains (@href,\"product/category&path=33\")]");

    private final By cameraProduct =By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
    // tiene nombre pero si lo uso no lo encuentra. y falla el test.

    WebDriver driver;
    WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitulo(){
        WebElement myAccountTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountTitle));
        return myAccountTitleElement.getText();
    }

    public void ingresarSeccionCameras(){
        WebElement cameraBtnElement = wait.until(ExpectedConditions.elementToBeClickable(cameraBtn));
        cameraBtnElement.click();
    }

    public void selectProduct(){
        WebElement cameraProductElement = wait.until(ExpectedConditions.elementToBeClickable(cameraProduct));
        cameraProductElement.click();
    }

}
