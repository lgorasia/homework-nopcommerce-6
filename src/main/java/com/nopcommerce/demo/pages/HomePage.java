package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }




    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(linkText = "Register")
            WebElement registerLink;
    @FindBy(linkText = "Log out")
            WebElement logOutLink;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
            WebElement computerField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
            WebElement electronicsField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[3]/a[1]")
            WebElement apparelField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[4]/a[1]")
            WebElement digitalDownloadField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
            WebElement booksField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[6]/a[1]")
            WebElement jewelryField;
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[7]/a[1]")
            WebElement giftCardsField;
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
            WebElement nopcommerceLogoField;
    @FindBy(xpath = "//a[contains(text(),'My account')]")
            WebElement myAccountField;


    public void clickOnLoginLink() {
        log.info("Clicking on login link : " + loginLink.toString());


        clickOnElement(loginLink);
    }
    public String loginButtonText(){
        log.info("loginButtonText : " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public String logOutTextLink() {
        log.info("logOutTextLink : " + logOutLink.toString());
        return getTextFromElement(logOutLink);
    }
    public void clickOnLogoutButton(){
         clickOnElement(logOutLink);
        log.info("clickOnLogoutButton : " + logOutLink.toString());
    }

    public void clickOnRegisterLink() {


        clickOnElement(registerLink);
        log.info("clickOnRegisterLink : " + registerLink.toString());
    }

    public void clickOnComputer() {

        clickOnElement(computerField);
        log.info("clickOnComputer : " + computerField.toString());
    }

    public void clickOnelectronics() {

        clickOnElement(electronicsField);
        log.info("clickOnelectronics : " + electronicsField.toString());
    }

    public void clickOnApparel() {

        clickOnElement(apparelField);
        log.info("clickOnApparel : " + apparelField.toString());
    }

    public void clickOnDigitalDownload() {

        clickOnElement(digitalDownloadField);
        log.info("clickOnDigitalDownload : " + digitalDownloadField.toString());
    }

    public void clickOnBook() {

        clickOnElement(booksField);
        log.info("clickOnBook : " + booksField.toString());
    }

    public void clickOnJewelry() {

        clickOnElement(jewelryField);
        log.info("clickOnJewelry : " + jewelryField.toString());
    }

    public void clickOnGiftCards() {

        clickOnElement(giftCardsField);
        log.info("clickOnGiftCards : " + giftCardsField.toString());
    }

    public String nopcommerceLogoText() {
        log.info("nopcommerceLogoText : " + nopcommerceLogoField.toString());
        return getTextFromElement(nopcommerceLogoField);
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccountField);
        log.info("clickOnMyAccount : " + myAccountField.toString());
    }




    }


