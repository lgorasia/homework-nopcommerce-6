package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public DesktopsPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsTextField;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement buildYourOwnComputerField;

    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputerField);

    }
    public String desktopText(){
        log.info("desktopText : " + desktopsTextField.toString());
        return getTextFromElement(desktopsTextField);
    }
}
