package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnimalSelectionPage {

    WebDriver driver;

    public AnimalSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinue() {
        // Home page Continue button
        driver.findElement(By.xpath("/html//button[@id='continue_button']")).click();
    }

    public void selectAnimalFromDropDownList(String animalNumber) {
        driver.findElement(By.xpath("//table[@id='table1']//div[@class='ng-scope']/select[@class='ng-pristine ng-valid']/option[@value='" + animalNumber + "']")).click(); // DropDown take 3
    }
}
