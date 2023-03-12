package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.TestApp;

import java.time.Duration;

public class RegisterPage {

    WebDriver driver=TestApp.getInstance().getDriver();
    PropertyFileReader prop=new PropertyFileReader();
    String firstNameElement=prop.getProperty("RegisterPage","first.name.element");
    String lastNameElement = prop.getProperty("RegisterPage","last.name.element");

    public RegisterPage setFirstName(String firstName){

        TestApp.getInstance().waitUntilNextElementAppear(By.name(firstNameElement), Duration.ofSeconds(5));
        driver.findElement(By.name(firstNameElement)).sendKeys(firstName);
        return this;



    }

    public RegisterPage setLastName(String lastName){

        TestApp.getInstance().waitUntilNextElementAppear(By.name(lastNameElement), Duration.ofSeconds(5));
        driver.findElement(By.name(lastNameElement)).sendKeys(lastName);
        return this;
    }
    public RegisterPage setPhone(String phone){

        TestApp.getInstance().waitUntilNextElementAppear(By.name("phone"), Duration.ofSeconds(5));
        driver.findElement(By.name("phone")).sendKeys(phone);
        return this;
    }

    public RegisterPage setEmail(String email){

        TestApp.getInstance().waitUntilNextElementAppear(By.name("userName"), Duration.ofSeconds(5));
        driver.findElement(By.id("userName")).sendKeys(email);
        return this;
    }

    public RegisterPage setUserName(String userName){

        TestApp.getInstance().waitUntilNextElementAppear(By.name("email"), Duration.ofSeconds(5));
        driver.findElement(By.id("email")).sendKeys(userName);
        return this;
    }
    public RegisterPage setPassword(String password){

        TestApp.getInstance().waitUntilNextElementAppear(By.name("password"), Duration.ofSeconds(5));
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public RegisterPage setConfirmPassword(String ConfirmPassword){

        TestApp.getInstance().waitUntilNextElementAppear(By.name("confirmPassword"), Duration.ofSeconds(5));
        driver.findElement(By.name("confirmPassword")).sendKeys(ConfirmPassword);
        return this;
    }
    public RegisterPage selectCountry(String country){
        TestApp.getInstance().waitUntilNextElementAppear(By.name("country"), Duration.ofSeconds(5));
        Select countryDropdown = new Select(driver.findElement(By.name("country")));
        countryDropdown.selectByVisibleText(country);
        return this;
    }

    public RegisterSuccessPage clickSubmit(){
        TestApp.getInstance().waitUntilNextElementAppear(By.name("submit"),Duration.ofSeconds(5));
        driver.findElement(By.name("submit")).click();
        return new RegisterSuccessPage();
    }

}
