package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.zac.test.util.Constants.BACK_BUTTON;
import static com.zac.test.util.Constants.CONFIRMATION_TEXT;

public class ConfirmPage extends BasePage {

    public ConfirmPage(WebDriver driver) {
        super(driver);
    }

    // Click on Back Button
    public void clickBackButton() {
        click(By.xpath(BACK_BUTTON));
    }

    public String getConfirmationMessage() {
        return readText(By.xpath(CONFIRMATION_TEXT));
    }
}
