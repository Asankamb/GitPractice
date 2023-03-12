package com.guru99.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

import java.time.Duration;

public class RegisterSuccessPage {

    WebDriver driver=TestApp.getInstance().getDriver();

    public String getSalutationMessage() {
        TestApp.getInstance().waitUntilNextElementAppear(By.xpath("//*[contains(text(),\"Dear\")]"), Duration.ofSeconds(5));
        String actualText = driver.findElement(By.xpath("//*[contains(text(),\"Dear\")]")).getText();
         return actualText;
    }
}
