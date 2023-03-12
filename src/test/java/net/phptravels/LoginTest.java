package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @Test
    public void testLoginSuccess() throws InterruptedException {

        driver =new ChromeDriver();
        driver.get("https://phptravels.net/api/admin");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
        driver.findElement(By.name("password")).sendKeys("demoadmin");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        waitUntilNextElementAppear(By.xpath("//*[contains(text(),\"Sales\")]"),15);
        driver.findElement(By.xpath("//*[@href='https://phptravels.net/api/admin/settings/modules/']//following-sibling::a[1]")).click();


    }

    private WebElement waitUntilNextElementAppear(By locator,int timeout){

        WebElement element =new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;


    }
}
