package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class HomePage {

    WebDriver driver= TestApp.getInstance().getDriver();

    PropertyFileReader prop=new PropertyFileReader();
    String registerMenuElement =prop.getProperty("HomePage","register.menu.element");

    public RegisterPage clickOnRegisterLink(){

        TestApp.getInstance().waitUntilNextElementAppear(By.linkText(registerMenuElement),Duration.ofSeconds(5));
        driver.findElement(By.linkText(registerMenuElement)).click();
        return new RegisterPage();

    }
}
