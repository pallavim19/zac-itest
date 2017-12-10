package com.zac.test.def;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Step definition for Zoo Adoption Center
 */
public class ZacStepDef {

    private static final String WEB_URL = "http://www.thetestroom.com/jswebapp";
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";
    private WebDriver driver;

    @Before
    public void before() {
        if (System.getProperty("browser").equals("firefox")){
           // String FIREFOXDRIVERPATH = "C:\\work\\Software\\geckodriver-v0.16.1-win64\\geckodriver.exe";
           // System.setProperty(WEBDRIVER_GECKO_DRIVER, FIREFOXDRIVERPATH);
            //Driver Instantiation: Instantiate driver object as FirefoxDriver
            driver = new FirefoxDriver();
        }
    }

    @After
    public void after() {
        driver.close();
    }

    @Given("^I open webpage of Zoo Adoption Center$")
    public void openWepPage() {
        //Navigation: Open a website
        driver.navigate().to(WEB_URL);
    }

    @When("^I enter '(.*?)' in the text field$")
    public void provideName(String name) {
        // Provide name in the text field
        driver.findElement(By.xpath("//table[@id='table1']//td[@class='content']/div[@class='ng-scope']//input[@type='text']")).sendKeys(name);
    }

    @Then("^Below the text field '(.*?)' is displayed$")
    public void assertConfirmationMessage(String name) {
        Assert.assertEquals("Displayed name is wrong!", name, driver.findElement(
                By.xpath("//table[@id='table1']//td[@class='content']/div[@class='ng-scope']/h2[@class='ng-binding']")).getText());
    }

    @When("^I click continue button$")
    public void clickContinue() {
        // Home page Continue button
        driver.findElement(By.xpath("/html//button[@id='continue_button']")).click();
    }

    @When("^I select '(.*?)' from drop down list$")
    public void selectAnimalFromDropDownList(String animalNumber) {
        driver.findElement(By.xpath("//table[@id='table1']//div[@class='ng-scope']/select[@class='ng-pristine ng-valid']/option[@value='" +animalNumber+ "']")).click(); // DropDown take 3
    }

    @When("^I click on back button$")
        public void clickBackButton() {
        // Click on Back Button
        driver.findElement(By.xpath("/html//button[@id='back_button']")).click();
    }

    @Then("^The confirmation text is valid and matches to expected message$")
    public void assertConfirmationMessage() {
        Assert.assertEquals("Text confirmation message is wrong!", "Thank you for your selection. " +
                "Your animal adoption papers will be sent to you shortly with a lovely card from your selected animal.",
                driver.findElement(By.xpath("//table[@id='table1']//td[@class='content']/div[@class='ng-scope']/p")).getText());
    }
}