package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.zac.test.util.Constants.*;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate() {
        navigate(WEB_URL);
    }

    // Provide name in the text field
    public void provideName(String name) {
        writeText(By.xpath(TEXT_FIELD),name);
    }

    public String getMessageFromTextField() {
        return readText(By.xpath(MESSAGE_TEXT_FIELD));
    }

    // Home page Continue button
    public void clickContinue() {
        click(By.xpath(CONTINUE_BUTTON));
    }
}
