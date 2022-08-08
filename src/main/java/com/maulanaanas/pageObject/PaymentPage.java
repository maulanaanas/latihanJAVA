package com.maulanaanas.pageObject;

import com.maulanaanas.helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends SeleniumHelper {

    By frameChoosePayment = By.xpath("//*[@id = 'snap-midtrans']");
    By ccPayment = By.xpath("//a[@href='#/credit-card']//div[@class='list-title text-actionable-bold']");
    By inputCardNumber = By.xpath("//*[@class = 'valid-input-value']");
    By inputExpDate = By.xpath("//*[@id = 'card-expiry']");
    By inputCVV = By.xpath("//*[@id = 'card-cvv']");
    By clickPayNow = By.xpath("//*[@class = 'card-pay-button-part']");

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public WebDriver switchToFramePayment(){
        return webDriver.switchTo().frame(webDriver.findElement(frameChoosePayment));
    }

    public void clickCCPayment(){
        webDriver.findElement(ccPayment).click();

    }

    public void fillFormCreditCard(String cardNumber, String expDate, String cVV){
        setText(inputCardNumber, cardNumber);
        setText(inputExpDate, expDate);
        setText(inputCVV, cVV);
        webDriver.findElement(clickPayNow).click();
    }

}
