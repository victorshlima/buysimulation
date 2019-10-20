package com.automationpratice.component.controller.com.automationpratice.component.DriverInstance;

import com.automationpratice.component.controller.enumeration.ByPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class Util {

    WebDriver webDriver;



    public Util(WebDriver webDriver) {

        this.webDriver = webDriver;

    }


    public Boolean ClickByPath (By xpath){



        try {




           WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement Button = webDriver.findElement(xpath);

            Button.click();
            return true;
        } catch (Exception ex) {
            throw new RuntimeException ("Error 500 - Internal server error confirmed", ex);
        }

    }





}
