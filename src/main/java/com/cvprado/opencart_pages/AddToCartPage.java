package com.cvprado.opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCartPage {

    private final By imgProduct = By.xpath("//img[@title='Canon EOS 5D' and @class='img-responsive']");
    private final By listViewBtn = By.id("list-view");

    private final By addWishListBtn = By.xpath("//button[contains(@data-original-title, 'Add to Wish List')]");

    private final By wishListBtn = By.xpath("//a [contains (@href,\"account/wishlist\")]");

    WebDriver driver;
    WebDriverWait wait;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void verModoLista(){
        WebElement listViewBtnElement = wait.until(ExpectedConditions.elementToBeClickable(listViewBtn));
        listViewBtnElement.click();
    }

    public boolean productIsPresent(){
        WebElement imgProductElement = wait.until(ExpectedConditions.visibilityOfElementLocated(imgProduct));
        return imgProductElement.isDisplayed();
    }

    public void addToWishList(){
        WebElement addWishListBtnElement = wait.until(ExpectedConditions.elementToBeClickable(addWishListBtn));
        addWishListBtnElement.click();
    }

    public void ingresarWishList(){
        WebElement wishListBtnElement = wait.until(ExpectedConditions.elementToBeClickable(wishListBtn));
        wishListBtnElement.click();
    }
}