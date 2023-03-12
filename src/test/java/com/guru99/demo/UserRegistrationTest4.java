package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class UserRegistrationTest4 {

    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage regSuccess;

    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        homePage=new HomePage();
        registerPage=homePage.clickOnRegisterLink();


    }

    @Test
    public void testRegisterNewUser4() {
     regSuccess= registerPage.setFirstName("Asanka")
              .setLastName("Banda")
              .setPhone("0112323456")
              .setEmail("balla@gmail.com")
              .selectCountry("BELGIUM")
              .setUserName("Kamal5")
              .setPassword("abc123")
              .setConfirmPassword("abc123")
              .clickSubmit();
        Assert.assertEquals(regSuccess.getSalutationMessage(),"Dear Asanka Banda,","assertion failed");

    }

    @AfterMethod
    public void tearDown() {

        TestApp.getInstance().closeBrowser();

    }
}
