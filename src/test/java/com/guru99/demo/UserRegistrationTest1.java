package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class UserRegistrationTest1 {

    PropertyFileReader prop=new PropertyFileReader();
    String url = prop.getProperty("config","url");

    @Test
    public void testRegisterNewUser() throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement registerMenuLink= driver.findElement(By.linkText("REGISTER"));
        registerMenuLink.click();
        driver.findElement(By.name("firstName")).sendKeys("Imperial");
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Updated Imperial");

        driver.findElement(By.name("lastName")).sendKeys("College");
        driver.findElement(By.name("phone")).sendKeys("0111234567");
        driver.findElement(By.id("userName")).sendKeys("test@gmail.com");
        driver.findElement(By.id("email")).sendKeys("test2@gmail.com");
        driver.findElement(By.name("password")).sendKeys("P@ssword123");
        driver.findElement(By.name("confirmPassword")).sendKeys("P@ssword123");
        Select countryDropdown = new Select(driver.findElement(By.name("country")));
        countryDropdown.selectByVisibleText("BELGIUM");
        Thread.sleep(3000);
        driver.findElement(By.name("submit")).click();
        String actualText =driver.findElement(By.xpath("//*[contains(text(),\"Dear\")]")).getText();
        Assert.assertEquals(actualText,"Dear Updated Imperial College,");
    }
}
