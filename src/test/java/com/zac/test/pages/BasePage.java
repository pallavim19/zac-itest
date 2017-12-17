package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    //Navigate Method
    public void navigate(String url) {
        driver.navigate().to(url);
    }

    //Click Method
    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    //Write Text
    public void writeText(By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }

    //Read Text
    public String readText(By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
}