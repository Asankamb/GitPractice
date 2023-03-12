package com.guru99.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class UserRegistrationTest2 {
    WebDriver driver;
    PropertyFileReader prop=new PropertyFileReader();
    String url = prop.getProperty("config","url");
    Home home;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        home=new Home();
        home.clickOnRegisterLink(driver);
        
    }

    @Test
    public void testRegisterNewUser() {
    }
}
