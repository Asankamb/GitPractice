package com.guru99.demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.TestApp;

public class RegisterUserStepDefinition {

    HomeFactoryPage homePage;
    RegisterFactoryPage registerPage;
    RegisterSuccessFactoryPage regSuccess;
    @Given("user is on Mercury Home Page -->Register Page")
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToUrl();
        homePage= PageFactory.initElements(TestApp.getInstance().getDriver(),HomeFactoryPage.class);
       registerPage=homePage.clickOnRegisterMenu();
    }

    @Given("user enter first name as {string}")
    public void setFirstName(String firstName) {
        registerPage.setFirstName(firstName);
    }

    @And("user enter last name as {string}")
    public void setLastName(String lastName) {
        registerPage.setLastName(lastName);
    }

    @When("user clicks on submit")
    public void submit() {
        regSuccess=registerPage.clickSubmit();
    }

    @Then("salutation message will denote as {string}")
    public void verifySalutationMessage(String expectedResult) {
        Assert.assertEquals(regSuccess.getSalutationMessage(),expectedResult);
    }
}
