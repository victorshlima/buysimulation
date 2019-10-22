package com.automationpratice.component.controller.WebDriverInstance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Util2 {


    WebElement element;
    WebDriver webDriver;
    WebDriverWait wait;
    int timeOut;

    public Util2(WebDriver webDriver, int timeOut) {
        this.webDriver = webDriver;
        this.timeOut = timeOut;
        this.wait = new WebDriverWait(webDriver, timeOut);
    }


    public void Path(By xpath) {

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            element = webDriver.findElement(xpath);
        } catch (Exception ex) {
            throw new RuntimeException("RuntimeException: " + xpath.toString());
        }

    }


    public void getURL(String url) {
        webDriver.get(url);
    }

    public void ClickByPath(WebElement wElement) {

        wElement.click();
    }

    public void findElement(By xpath) {


        element.click();

    }

    public String getTextElements(By xpath, String atribute) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            List<WebElement> elements = webDriver.findElements(xpath);
            String value = "";
            for (WebElement e : elements) {
                try {
                    if (e.getAttribute(atribute).equals("true")) {
                        return e.getText();
                    }
                } catch (RuntimeException ex) {
                    ex.getMessage();
                }
            }
            return value;
        } catch (RuntimeException ex) {

        }
        throw new RuntimeException("Error 500 - Internal server error confirmed");
    }


    public Boolean selecItemListBox(By xpath, String value) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            List<WebElement> elements = webDriver.findElements(xpath);
            for (WebElement e : elements) {
                try {
                    if (e.getText().trim().equals(value)) {
                        e.click();
                        return true;
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }
            return false;
        } catch (Exception ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }


    public String getTextElement(By xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement element = webDriver.findElement(xpath);
            return element.getText();
        } catch (Exception ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }

    public String getAtribute(By xpath, String atribute) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement element = webDriver.findElement(xpath);
            return element.getAttribute(atribute);
        } catch (Exception ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }

    public Boolean InsertValue(By xpath, String value) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            WebElement element = webDriver.findElement(xpath);
            element.sendKeys(value);
            return true;
        } catch (Exception ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }

    }


}
