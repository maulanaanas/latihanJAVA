package com.maulanaanas.pageObject;

import com.maulanaanas.helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuingBankPage extends SeleniumHelper {

    By frameIssuingBank = By.xpath("//*[@class = 'iframe-3ds']");
    By inputPassword = By.xpath("//*[@id = 'PaRes']");
    By clickOK = By.xpath("//*[@class = 'btn btn-sm btn-success']");

    public IssuingBankPage(WebDriver driver) {
        super(driver);
    }

    public WebDriver switchToFrameIssuingBank(){
        return webDriver.switchTo().frame(webDriver.findElement(frameIssuingBank));
    }

    public void fillFormIssuingBank(String password){
        setText(inputPassword, password);
        webDriver.findElement(clickOK);
    }
}
