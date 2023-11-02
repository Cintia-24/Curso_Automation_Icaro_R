package com.cvprado.openCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver,chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");



        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);

    }

    @Test

    @AfterMethod
    public void tearDown(){
        if(this.driver !=null) {
            this.driver.quit();
        }
    }

}
