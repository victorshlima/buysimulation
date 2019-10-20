package com.automationpratice.component.controller.enumeration;

import org.openqa.selenium.By;

public enum ByPath {

    URL_HOME("http://automationpractice.com/index.php?", "Home Page"),


    CATEGORY_WOMAN("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a", " "),







    ;




    public String code;
    public String description;




    ByPath(String code, String description) {
        this.code = code;
        this.description = description;
    }



    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }




}

