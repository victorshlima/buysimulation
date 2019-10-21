package com.automationpratice.component.controller.WebDriverInstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class DriverInstance {


    private static final Logger logger = LoggerFactory.getLogger(DriverInstance.class);

    //ALTERAR PARA LOCALLLLLLLLL
    private final String pathOfChromeDriver = "D:\\development\\GitHubProjects\\dbserver\\purchase-simulation\\purchase-simulation\\src\\main\\resources\\drivers\\chrome\\chromedriver.exe";


    public DriverInstance() {
    }

    public static DriverInstance getInstance() {
        return new DriverInstance();
    }

    public WebDriver buildANewDriver() {
        System.setProperty("webdriver.chrome.driver", pathOfChromeDriver);
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);


        return new ChromeDriver();
    }







}
