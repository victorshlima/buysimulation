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
import java.util.List;

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


    public String getTextElements(By xpath, String atribute){

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
           List< WebElement> elements = webDriver.findElements(xpath);
          String  value="";
            for (WebElement e:elements) {



                //QUANDO NÂO ECONTRA CAI NO CAtch

                try {
                   // String valueAtt = e.getAttribute(atribute);
                  //  String text = e.getText();

                    if( e.getAttribute(atribute).equals("true")) {
                        return   value =   e.getText();
                    }else {
                        value = "";
                    }

                } catch  (Exception ex){

                    ex.getMessage();

                }
                 }
            return value;
        } catch (Exception ex) {
            throw new RuntimeException ("Error 500 - Internal server error confirmed", ex);
        }

    }


    public Boolean selecItemListBox(By xpath, String value){

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            List< WebElement> elements = webDriver.findElements(xpath);

            for (WebElement e:elements) {
                //QUANDO NÂO ECONTRA CAI NO CAtch
                try {

                    if( e.getText().toUpperCase().equals(value)) {
                        e.click();
                    }else {
                        return false;
                    }

                } catch  (Exception ex){
                    ex.getMessage();
                }
            }
            return false;
        } catch (Exception ex) {
            throw new RuntimeException ("Error 500 - Internal server error confirmed", ex);
        }

    }


    public String getTextElement(By xpath){

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement element = webDriver.findElement(xpath);


            return  element.getText();
        } catch (Exception ex) {
            throw new RuntimeException ("Error 500 - Internal server error confirmed", ex);
        }

    }

    public String getAtribute(By xpath, String atribute){

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement element = webDriver.findElement(xpath);
            return  element.getAttribute(atribute);
        } catch (Exception ex) {
            throw new RuntimeException ("Error 500 - Internal server error confirmed", ex);
        }

    }

    public Boolean InsertValue(By xpath, String value){

        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement element = webDriver.findElement(xpath);
            element.sendKeys(value);

            return  true;

        } catch (Exception ex) {
            throw new RuntimeException ("Error 500 - Internal server error confirmed", ex);
        }

    }


}
