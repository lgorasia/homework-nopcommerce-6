package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public ComputerPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "h1")
    WebElement computerTextField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement desktopField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement notebookField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/img[1]")
    WebElement softwareField;





    public String computerText(){
        log.info("computerText : " + computerTextField.toString());
        return getTextFromElement(computerTextField);
    }
    public void clickOnDesktop(){
        clickOnElement(desktopField);
        log.info("clickOnDesktop : " + desktopField.toString());
    }
    public void clickOnNotebook(){
        clickOnElement(notebookField);
        log.info("clickOnNotebook : " + notebookField.toString());
    }
    public void clickOnSoftware(){
        clickOnElement(softwareField);
        log.info("clickOnSoftware : " + softwareField.toString());
    }

}
