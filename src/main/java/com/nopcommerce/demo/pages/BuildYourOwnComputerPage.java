package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerField;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorSelection;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramSelection;
    @FindBy(id = "product_attribute_3_6")
    WebElement hddRadioSelection1;
    @FindBy(css = "#product_attribute_3_7")
    WebElement hddRadioSelection2;
    @FindBy(css = "#product_attribute_4_8")
    WebElement osRadioSelection1;
    @FindBy(css = "#product_attribute_4_9")
    WebElement osRadioSelection2;
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareSelection1;
    @FindBy(css = "#product_attribute_5_11")
    WebElement softwareSelection2;
    @FindBy(css = "#product_attribute_5_12")
    WebElement softwareSelection3;
    @FindBy(css = "#add-to-cart-button-1")
    WebElement addToCartField;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToCartVerificationField;

    public void clickOnBuildYourComputer() {
        clickOnElement(buildYourOwnComputerField);
        log.info("click On Build Your Computer : " + buildYourOwnComputerField.toString());
    }

    public void clickOnProcessor(String processor) {
        sendTextToElement(processorSelection, processor);
        log.info("click On Processor : " + processorSelection.toString());
    }

    public void selecRamFromFromDropdown(String ram) {
        selectByVisibleTextFromDropDown(ramSelection, ram);
        log.info("selec Ram From From Dropdown : " + ramSelection.toString());
    }

    public void clickOnHddRadio(String hdd) {
        if (hdd == "320 GB") {
            clickOnElement(hddRadioSelection1);
        } else {
            clickOnElement(hddRadioSelection2);

        }
    }

    public void osRadio(String os) {
        if (os == "Vista Home [+$50.00] ") {
            clickOnElement(osRadioSelection1);
        } else {
            clickOnElement(osRadioSelection2);
        }
    }


    public void clickSoftware(String software ) {
        clickOnElement(softwareSelection1);
        if (software == "Microsoft Office [+$50.00]") {

            clickOnElement(softwareSelection1);
        } else if (software == "Acrobat Reader [+$10.00]") {
            clickOnElement(softwareSelection2);
        } else {
            clickOnElement(softwareSelection3);
        }
    }
    public void clickOnSoftware(){
        clickOnElement(softwareSelection1);
    }

    public void addtocart(){
        clickOnElement(addToCartField);
    }
    public String addToCartVerification(){
        return getTextFromElement(addToCartVerificationField);
    }

}
