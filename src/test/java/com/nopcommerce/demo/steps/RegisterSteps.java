package com.nopcommerce.demo.steps;


import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class RegisterSteps {
    @Then("^I should see register text$")
    public void iShouldSeeRegisterText() {
       String actualText= new RegisterPage().registrationText();
       String expectedText = "Register";
        Assert.assertEquals(expectedText,actualText);
    }

    @And("^I click on registration$")
    public void iClickOnRegistration() {
        new RegisterPage().clickOnRegistration();
    }


    @Then("^I should see error message for mandatory field$")
    public void iShouldSeeErrorMessageForMandatoryField() {
        String expectedFirstNameMessage = "First name is required.";
        String actualFirstnameMessage =new RegisterPage().firstNameRequireText();
        org.testng.Assert.assertEquals(actualFirstnameMessage,expectedFirstNameMessage);

        String expextedLastNameMessage="Last name is required.";
        String actualLastNameMessagenew =new RegisterPage().lastNameRequireText();
        org.testng.Assert.assertEquals(expextedLastNameMessage,actualLastNameMessagenew);

        String expectedEmailMessage ="Email is required.";
        String actualEmailMessage =new RegisterPage().emailRequireText();
        org.testng.Assert.assertEquals(expectedEmailMessage,actualEmailMessage);

        String expectedPasswordMessage = "Password is required.";
        String actualPasswordMessage =new RegisterPage().passwordRequireText();
        org.testng.Assert.assertEquals(expectedPasswordMessage,actualPasswordMessage);

        String expectedConfirmPasswordMessage = "Password is required.";
        String actualConfirmPasswordMessage= new RegisterPage().confirmPasswordRequireText();
        org.testng.Assert.assertEquals(expectedConfirmPasswordMessage,actualConfirmPasswordMessage);


    }


    @And("^I enter firstname$")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Pankaj");
    }

    @And("^I enter lastname$")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("Patel");
    }

    @And("^I select day$")
    public void iSelectDay() {
        new RegisterPage().selectDay("29");
    }

    @And("^I select month$")
    public void iSelectMonth() {
        new RegisterPage().selectMonth("May");
    }

    @And("^I select year$")
    public void iSelectYear() {
        new RegisterPage().selectYear("1980");
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new RegisterPage().enterEmail("9prafulpatel20@gmail.com");
    }

    @And("^I enter password$")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("12345678");
    }

    @And("^I enter Confirm Password$")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("12345678");
    }



    @And("^I select gender$")
    public void iSelectGender() {
        new RegisterPage().gender();
    }

    @Then("^I should see Your registration completed message$")
    public void iShouldSeeYourRegistrationCompletedMessage() {
        String actualText =new RegisterPage().registrationCompliton();
        String expectedText = "Your registration completed";
        org.testng.Assert.assertEquals(actualText,expectedText);
    }
}
