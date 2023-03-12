package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestApp;

import java.time.Duration;

public class RegisterFactoryPage {

    @FindBy (name = "firstName")
    private WebElement firstNameElement;

    @FindBy (name="lastName")
    private WebElement lastNameElement;

    @FindBy (name="submit")
    private WebElement submirButtonElement;



    public RegisterFactoryPage setFirstName(String firstname){
        TestApp.getInstance().waitUntilNextElementAppear(By.name("firstName"), Duration.ofSeconds(5));
        firstNameElement.sendKeys(firstname);
        return this;
    }

    public RegisterFactoryPage setLastName(String lastname){
        TestApp.getInstance().waitUntilNextElementAppear(By.name("lastName"), Duration.ofSeconds(5));
        lastNameElement.sendKeys(lastname);
        return this;
    }
    public RegisterSuccessFactoryPage clickSubmit(){
        TestApp.getInstance().waitUntilNextElementAppear(By.name("submit"),Duration.ofSeconds(5));
        submirButtonElement.click();
        return PageFactory.initElements(TestApp.getInstance().getDriver(),RegisterSuccessFactoryPage.class);

    }
}
