package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.testng.Assert;

public class ComputerSteps {
    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @Then("^I should see Computer text$")
    public void iShouldSeeComputerText() {
        String actualText = new ComputerPage().computerText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);
    }

    @And("^I click on Desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }

    @Then("^I should see Desktops text$")
    public void iShouldSeeDesktopsText() {
        String actualText=new DesktopsPage().desktopText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText,expectedText);

    }
    @And("^I click on product name 'Build your own computer'$")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("^I select processor \"([^\"]*)\"$")

    public void iSelectProcessor(String processor) throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().clickOnProcessor(processor);


    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().selecRamFromFromDropdown(ram);


    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd) throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().clickOnHddRadio(hdd);


    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().osRadio(os);


    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) throws InterruptedException {
        Thread.sleep(2000);
        new BuildYourOwnComputerPage().clickSoftware(software);


    }
    @And("^I click on 'ADD TO CART' Button$")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().addtocart();
    }

    @Then("^I shold see 'The product has been added to your shopping cart' message$")
    public void iSholdSeeTheProductHasBeenAddedToYourShoppingCartMessage() {
        String expectedText = "The product has been added to your shopping cart";
        String actualText = new BuildYourOwnComputerPage().addToCartVerification();
        Assert.assertEquals(actualText,expectedText);
    }



}
