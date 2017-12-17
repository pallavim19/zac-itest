package com.zac.test.driver.browser;

import com.zac.test.driver.DriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {
    @Override
    protected void startService() {
        createDriver();
    }

    @Override
    protected void stopService() {
        driver.close();
    }

    @Override
    protected void createDriver() {
        //Driver Instantiation: Instantiate driver object as FirefoxDriver
        driver = new FirefoxDriver();
    }
}
