package com.guru99.demo;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

public class UserRegistrationTest5 {

    HomeFactoryPage home;
    RegisterFactoryPage register;
    RegisterSuccessFactoryPage registerSuccess;

    @BeforeMethod
    public void setUp() {

        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        home= PageFactory.initElements(TestApp.getInstance().getDriver(),HomeFactoryPage.class);
        register= home.clickOnRegisterMenu();
    }

    @Test
    public void testNewRegisterUser() {
        registerSuccess=register.setFirstName("Asanka")
                .setLastName("Perera")
                .clickSubmit();

        Assert.assertEquals(registerSuccess.getSalutationMessage(),"Dear Asanka Perera,");
    }

    @AfterMethod
    public void tearDown() {

    }
}
