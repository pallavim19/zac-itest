package com.zac.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.zac.test.util.Constants.ANIMAL_DROP_DOWN_LIST;
import static com.zac.test.util.Constants.CONTINUE_BUTTON;

public class AnimalSelectionPage extends BasePage {

    public AnimalSelectionPage(WebDriver driver) {
        super(driver);
    }

    // Home page Continue button
    public void clickContinue() {
        click(By.xpath(CONTINUE_BUTTON));
    }

    public void selectAnimalFromDropDownList(String animalNumber) {
        click(By.xpath(String.format(ANIMAL_DROP_DOWN_LIST, animalNumber)));
    }
}
