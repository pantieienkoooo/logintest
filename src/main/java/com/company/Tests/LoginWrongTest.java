package com.company.Tests;

import org.junit.Test;

public class LoginWrongTest extends BaseTest{
    @Test
    public void incorrectTest(){
        app.loginPage.loginwrong();
    }
}
