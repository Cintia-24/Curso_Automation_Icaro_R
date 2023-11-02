package com.cvprado.clase_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrimeraPruebaAutomationTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver,chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");

        //options.addArguments("-- headless"); sirve para que el test se ejecute en background

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);

        //this.driver.manage().window().maximize();

    }
    @Test
    public void abrirPagina(){
        this.driver.get("https://opencart.abstracta.us/");
    }

    @AfterMethod
    public void tearDown(){
        if(this.driver !=null) {
            this.driver.quit();
        }
    }
}
