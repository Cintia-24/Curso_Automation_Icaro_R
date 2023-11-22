package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPage {

    private By title = By.xpath("//*[@id=\"content\"]/h2");
    private By productImg = By.xpath("//img[@title='Canon EOS 5D' and @class='img-thumbnail']");

    WebDriver driver;
    WebDriverWait wait;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public String getTitulo() {
        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(title));
        return titleElement.getText();
    }
    public boolean validarWishList(){
        WebElement productImgElement = wait.until(ExpectedConditions.visibilityOfElementLocated (productImg));
        return productImgElement.isDisplayed();
    }
}
