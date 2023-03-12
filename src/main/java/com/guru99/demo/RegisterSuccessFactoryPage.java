package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestApp;

import java.time.Duration;

public class RegisterSuccessFactoryPage {

    @FindBy (xpath="//*[contains(text(),\"Dear\")]")
    private WebElement salutationMessage;

    public String getSalutationMessage() {
        TestApp.getInstance().waitUntilNextElementAppear(By.xpath("//*[contains(text(),\"Dear\")]"), Duration.ofSeconds(5));
        String actualText=salutationMessage.getText();
        return actualText;
    }
}
