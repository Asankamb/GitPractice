package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class HomeFactoryPage {

    @FindBy(linkText = "REGISTER")
    private WebElement registerMenuElement;

    public RegisterFactoryPage clickOnRegisterMenu(){
        TestApp.getInstance().waitUntilNextElementAppear(By.linkText("REGISTER"), Duration.ofSeconds(5));
        registerMenuElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),RegisterFactoryPage.class);
    }
}
