package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.zac.test.util.Constants.ANIMAL_DROP_DOWN_LIST;
import static com.zac.test.util.Constants.CONTINUE_BUTTON;

public class AnimalSelectionPage {

    WebDriver driver;

    public AnimalSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinue() {
        // Home page Continue button
        driver.findElement(By.xpath(CONTINUE_BUTTON)).click();
    }

    public void selectAnimalFromDropDownList(String animalNumber) {
        driver.findElement(By.xpath(String.format(ANIMAL_DROP_DOWN_LIST, animalNumber))).click(); // DropDown take 3
    }
}
