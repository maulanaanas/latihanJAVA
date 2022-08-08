package com.maulanaanas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    WebDriver webDriver;
    WebDriverWait w;

    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");
        // lokasi web driver
        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

        // open web tujuan : midtrans
        //frame home
        webDriver.get("https://demo.midtrans.com/#");
        webDriver.manage().window().maximize();
        webDriver.getWindowHandles().forEach(tab->webDriver.switchTo().window(tab));
        w = new WebDriverWait(webDriver, Duration.ofSeconds(3));
    }

    @After
    public void closeWebBrowser(){
//        webDriver.quit();
    }
}
