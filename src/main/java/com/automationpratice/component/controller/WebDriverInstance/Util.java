package com.automationpratice.component.controller.WebDriverInstance;

import com.automationpratice.component.controller.exception.ElementNotFound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Util {

    List<WebElement> elements;
    WebElement element;
    WebDriver webDriver;
    WebDriverWait wait;
    int timeOut;

    public Util(WebDriver webDriver, int timeOut) {
        this.webDriver = webDriver;
        this.timeOut = timeOut;
        this.wait = new WebDriverWait(webDriver, timeOut);
    }

    public WebElement elementPathValidate(By xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            return element = webDriver.findElement(xpath);
        } catch (RuntimeException ex) {
            throw new ElementNotFound("RuntimeException, element " + xpath.toString() + "timeout: " + timeOut);
        }
    }

    public List<WebElement> elementsPathValidate(By xpath) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
            return webDriver.findElements(xpath);
        } catch (RuntimeException ex) {
            throw new RuntimeException("RuntimeException, element " + xpath.toString() + "timeout: " + timeOut);
        }
    }

    public void getURL(String url) {
        try {
            webDriver.get(url);
        } catch (RuntimeException ex) {
            throw new RuntimeException("URL Not found" + url);
        }
    }

    public void ClickByPath(By xpath) {
        try {
            element = elementPathValidate(xpath);
            element.click();
        } catch (RuntimeException ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed  " + xpath);
        }
    }

    public String getTextElement(By xpath) {
        try {
            element = elementPathValidate(xpath);
            return element.getText();
        } catch (RuntimeException ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }

    public String getAtribute(By xpath, String atribute) {
        try {
            element = elementPathValidate(xpath);
            element = webDriver.findElement(xpath);
            return element.getAttribute(atribute);
        } catch (RuntimeException ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }

    public void InsertValue(By xpath, String value) {
        try {
            element = elementPathValidate(xpath);
            element = webDriver.findElement(xpath);
            element.sendKeys(value);
        } catch (RuntimeException ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }

    public void selecItemListBox(By xpath, String value) {
        try {
            elements = elementsPathValidate(xpath);
            elements = webDriver.findElements(xpath);
            for (WebElement e : elements) {
                try {
                    if (e.getText().trim().equals(value)) {
                        e.click();
                    }
                } catch (RuntimeException ex) {
                    ex.getMessage();
                }
            }
        } catch (RuntimeException ex) {
            throw new RuntimeException("Error 500 - Internal server error confirmed", ex);
        }
    }


//    public String getTextElements(By xpath, String atribute) {
//        elements = elementsPathValidate(xpath);
//        elements = webDriver.findElements(xpath);
//        for (WebElement e : elements) {
//            try {
//                if (e.getAttribute(atribute).equals("true")) {
//                    return e.getText();
//                }
//            } catch (Exception ex) {
//
//            }
//
//        }
//        throw new RuntimeException("Error 500 - Internal server error confirmed");
//    }


}