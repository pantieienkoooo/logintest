package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginPage extends BasePage {
    @FindBy(name = "identifier")
    public WebElement email;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(xpath = "//div[@id='identifierNext']")
    public WebElement loginnext;
    @FindBy(xpath = "//div[@id='passwordNext']")
    public WebElement passwordnext;
    @FindBy(className = "ZrQ9j")
    public WebElement logincorrect;
    @FindBy(className = "dEOOab RxsGPe")
    public WebElement loginincorrect;



    public void login() {
        email.sendKeys("logintest71@gmail.com");
        loginnext.click();
        password.sendKeys("testlogin17");
        passwordnext.click();
logincorrect.getText();
assertEquals(logincorrect.getText(), "Добро пожаловать, Login Test!");
        System.out.println("Maks is awesome!!!");
        driver.close();
    }

    public void loginwrong() {
        email.sendKeys("logintest@gmail.com");
        loginnext.click();
        password.sendKeys("testlogin");
        passwordnext.click();
        loginincorrect.getText();
        assertEquals(loginincorrect.getText(), "Неверный пароль. Повторите попытку или нажмите на ссылку \"Забыли пароль?\", чтобы сбросить его.");
        System.out.println("oooPS");
        driver.close();
    }
}
