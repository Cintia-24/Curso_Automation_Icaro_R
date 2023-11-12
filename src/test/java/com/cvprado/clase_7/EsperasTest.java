package com.cvprado.clase_7;

import com.cvprado.openCart.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class EsperasTest extends BaseTest {

    @Test
    public void validarTitle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        By title = By.xpath("//div[@id='finish']/h4");
        By startBtn = By.xpath("//div[@id='start']/button");

        getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //WebElement titleElement = getDriver().findElement(title);

        WebElement startElement = wait.until(ExpectedConditions.elementToBeClickable(startBtn));
        startElement.click();

        WebElement titleElement = wait.until(visibilityOfElementLocated(title));

        Assert.assertEquals(titleElement.getText(), "Hello World!");

    }
}
