package com.maulanaanas.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHelper {

    public WebDriver webDriver;

    public void setText(By by, String text){
        webDriver.findElement(by).clear();
        webDriver.findElement(by).sendKeys(text);
    }

    public SeleniumHelper(WebDriver driver) {
        this.webDriver = driver;
    }
}
