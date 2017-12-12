package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmPage {

    WebDriver driver;

    public ConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBackButton() {
        // Click on Back Button
        driver.findElement(By.xpath("/html//button[@id='back_button']")).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(By.xpath("//table[@id='table1']//td[@class='content']/div[@class='ng-scope']/p")).getText();
    }
}
