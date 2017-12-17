package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.zac.test.util.Constants.BACK_BUTTON;
import static com.zac.test.util.Constants.CONFIRMATION_TEXT;

public class ConfirmPage {

    WebDriver driver;

    public ConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBackButton() {
        // Click on Back Button
        driver.findElement(By.xpath(BACK_BUTTON)).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(By.xpath(CONFIRMATION_TEXT)).getText();
    }
}
