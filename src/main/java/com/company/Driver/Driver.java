package com.company.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.company.Common.Constants.Base_URL;

public class Driver {
    public static WebDriver getDriver (){
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Base_URL);
        return driver;

    }

}
