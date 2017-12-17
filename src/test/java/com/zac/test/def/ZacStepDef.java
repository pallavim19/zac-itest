package com.zac.test.def;

import com.zac.test.pages.AnimalSelectionPage;
import com.zac.test.pages.ConfirmPage;
import com.zac.test.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.zac.test.util.Constants.*;

public class ZacStepDef {

    private WebDriver driver;
    private HomePage homePage;
    private AnimalSelectionPage animalSelectionPage;
    private ConfirmPage confirmPage;

    @Given("^I open webpage of Zoo Adoption Center$")
    public void openWebPage() {
        homePage.navigate();
    }

    @When("^I enter '(.*?)' in the text field$")
    public void provideName(String name) {
        // Provide name in the text field
        homePage.provideName(name);
    }

    @Then("^Below the text field '(.*?)' is displayed$")
    public void assertConfirmationMessage(String name) {
        String messageFromTextField = homePage.getMessageFromTextField();
        Assert.assertEquals(DISPLAYED_NAME_IS_WRONG, name, messageFromTextField);
    }

    @When("^I click continue button$")
    public void clickContinueFromHomePage() {
        // Home page Continue button
        homePage.clickContinue();
    }

    @When("^I select '(.*?)' from drop down list$")
    public void selectAnimalFromDropDownList(String animalNumber) {
        animalSelectionPage.selectAnimalFromDropDownList(animalNumber);
    }

    @When("^I click continue button from animalpage$")
    public void clickContinueFromAnimalPage() {
        // Home page Continue button
        animalSelectionPage.clickContinue();
    }

    @When("^I click on back button$")
    public void clickBackButton() {
        // Click on Back Button
        confirmPage.clickBackButton();
    }


    @Then("^The confirmation text is valid and matches to expected message$")
    public void assertConfirmationMessageFromConfirmationPage() {
        // Home page Continue button
        String confirmationMessage = confirmPage.getConfirmationMessage();
        Assert.assertEquals(TEXT_CONFIRMATION_MESSAGE_IS_WRONG, CONFIRMATION_MESSAGE,
                confirmationMessage);
    }

    @Before
    public void startUp() {
        if (System.getProperty(BROWSER).equals(FIREFOX)) {
            //Driver Instantiation: Instantiate driver object as FirefoxDriver
            driver = new FirefoxDriver();
        }

        homePage = new HomePage(driver);
        animalSelectionPage = new AnimalSelectionPage(driver);
        confirmPage = new ConfirmPage(driver);
    }

    @After
    public void close() {
        driver.quit();
    }
}
