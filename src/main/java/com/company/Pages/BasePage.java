package com.company.Pages;

import com.company.Driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected WebDriver driver = Driver.getDriver();
public BasePage(){
    PageFactory.initElements(driver, this);
}
}
