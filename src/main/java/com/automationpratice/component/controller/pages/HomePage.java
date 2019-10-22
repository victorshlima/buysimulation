package com.automationpratice.component.controller.pages;

import org.openqa.selenium.WebDriver;

public class HomePage  {


    private final String urlToLogon = "http://automationpractice.com/index.php?";

    public HomePage() {

    }

    public Boolean HomePage(WebDriver wDriver) {
        wDriver.get(urlToLogon);
        return true;
    }

}
