package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    WebElement registrationTextField;
    @FindBy(xpath = "//label[contains(text(),'Female')]")
    WebElement genderField;
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @FindBy(name = "DateOfBirthDay")
    WebElement dayField;
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthField;
    @FindBy(name = "DateOfBirthYear")
    WebElement yearField;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "register-button")
    WebElement clickOnRegisterField;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequireField;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequireField;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequireField;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorField;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorField;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedField;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueField;


    public String registrationText() {
        return getTextFromElement(registrationTextField);
    }

    public void gender() {

        clickOnElement(genderField);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void selectDay(String day) {
        selectByVisibleTextFromDropDown(dayField, day);
    }

    public void selectMonth(String month) {
        selectByVisibleTextFromDropDown(monthField, month);
    }

    public void selectYear(String year) {
        selectByVisibleTextFromDropDown(yearField, year);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegistration() {
        clickOnElement(clickOnRegisterField);
    }

    public String registrationCompliton() {
        return getTextFromElement(registrationCompletedField);
    }

    public void clickOnContinue() {
        clickOnElement(clickOnContinueField);
    }

    public String firstNameRequireText() {
        return getTextFromElement(firstNameRequireField);
    }
    public String lastNameRequireText(){
        return getTextFromElement(lastNameRequireField);
    }
    public String emailRequireText(){
        return getTextFromElement(emailRequireField);
    }
    public String passwordRequireText(){
        return getTextFromElement(passwordErrorField);
    }
    public String confirmPasswordRequireText(){
        return getTextFromElement(confirmPasswordErrorField);
    }
}
