package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals("Log in page not displayed",expectedMessage,actualMessage);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        String expectedText = "Log out";
        String actualText = new HomePage().logOutTextLink();
        org.testng.Assert.assertEquals(actualText,expectedText);

    }


    @Then("^I should see the error message$")
    public void iShouldSeeTheErrorMessage() {
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = new LoginPage().getErrorMessage();
        org.testng.Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");


    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new HomePage().clickOnLogoutButton();
    }


    @Then("^I should see login button$")
    public void iShouldSeeLoginButton() {
        String actualText =new HomePage().loginButtonText();
        String expectedText = "Log in";
        org.testng.Assert.assertEquals(actualText,expectedText);
    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }
}

