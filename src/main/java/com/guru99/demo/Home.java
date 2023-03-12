package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {
    WebDriver driver;

    public void clickOnRegisterLink(WebDriver driver){
        waitUntilNextElementAppear(driver,By.linkText("REGISTER"),5);
        driver.findElement(By.linkText("REGISTER"));


    }
    private WebElement waitUntilNextElementAppear(WebDriver driver,By locator, int timeout){

        WebElement element =new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;


    }
}
