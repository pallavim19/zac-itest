package com.zac.test.pages;

import com.zac.test.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.zac.test.util.Constants.*;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(Constants.WEB_URL);
    }

    public void provideName(String name) {
        // Provide name in the text field
        driver.findElement(By.xpath(TEXT_FIELD)).sendKeys(name);
    }

    public String getMessageFromTextField() {
        return driver.findElement(By.xpath(MESSAGE_TEXT_FIELD)).getText();
    }

    public void clickContinue() {
        // Home page Continue button
        driver.findElement(By.xpath(CONTINUE_BUTTON)).click();
    }
}
