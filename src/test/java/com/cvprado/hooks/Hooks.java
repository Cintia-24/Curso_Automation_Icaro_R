package com.cvprado.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Hooks {
    private static WebDriver driver;
    private static Properties properties;

    @Before
    public void setup() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(System.getProperty("user.dir")
                +"\\src\\test\\resources\\config.properties"));

        String browser = getConfigValue("browser");
        switch(browser){
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
            default:
                throw new RuntimeException("Navegador no disponible");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getConfigValue(String key){
        return properties.getProperty(key);
    }

    private WebDriver getChromeDriver(){
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver,chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("--hedless");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        return new ChromeDriver(options);

    }

    private WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();

        System.setProperty("webdriver, gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

        options.addArguments("-private");

        return new FirefoxDriver(options);
    }

    @After
    public void tearDown(){
        if(driver !=null) {
            driver.quit();
        }
    }
}
