package com.cvprado.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver,chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        driver = new ChromeDriver(options);

    }

    public static WebDriver getDriver() {
        return driver;
    }
    @After
    public void tearDown(){
        if(driver !=null) {
            driver.quit();
        }
    }
}
