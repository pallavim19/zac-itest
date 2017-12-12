package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final String WEB_URL = "http://www.thetestroom.com/jswebapp";

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(WEB_URL);
    }

    public void provideName(String name) {
        // Provide name in the text field
        driver.findElement(By.xpath("//table[@id='table1']//td[@class='content']/div[@class='ng-scope']//input[@type='text']")).sendKeys(name);
    }

    public String getMessageFromTextField() {
        return driver.findElement(By.xpath("//table[@id='table1']//td[@class='content']/div[@class='ng-scope']/h2[@class='ng-binding']")).getText();
    }

    public void clickContinue() {
        // Home page Continue button
        driver.findElement(By.xpath("/html//button[@id='continue_button']")).click();
    }
}
