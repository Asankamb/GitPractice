package com.guru99.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class UserRegistrationTest3 {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        homePage=new HomePage();
        homePage.clickOnRegisterLink();
        registerPage=new RegisterPage();


    }

    @Test
    public void testRegisterUser() {

        registerPage.setFirstName("Asanka");
        registerPage.setLastName("Bandara");

    }

    @AfterMethod
    public void tearDown() {

    }
}
