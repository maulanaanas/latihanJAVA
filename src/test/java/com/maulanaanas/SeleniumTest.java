package com.maulanaanas;

import com.maulanaanas.pageObject.HomePage;
import com.maulanaanas.pageObject.IssuingBankPage;
import com.maulanaanas.pageObject.PaymentPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class SeleniumTest extends BaseTest{

    //open web browser
    //open url https://demo.midtrans.com/#
        @Test
        public void testMidtrans(){
            System.out.println("Before Test");

            // Home Page
            HomePage homePage = new HomePage(webDriver);
            Assert.assertTrue(homePage.isDisplayed());
            String expectedHomeTitle = "Midtrans Pillow";
            Assert.assertEquals(expectedHomeTitle,homePage.getTitle());
            homePage.clickBuyNow();
            homePage.fillFormCheckout("50000","Anas","anas@mail.com","081286239165",
                    "Tangerang","Gading Serpong NO.7","17510");

            // Payment Page
            PaymentPage paymentPage = new PaymentPage(webDriver);
            webDriver = paymentPage.switchToFramePayment();
            paymentPage = new PaymentPage(webDriver);
            paymentPage.clickCCPayment();
            paymentPage.fillFormCreditCard("4811111111111114","0125","123");

            // Issuing Bank Page
            IssuingBankPage issuingBankPage = new IssuingBankPage(webDriver);
            webDriver = issuingBankPage.switchToFrameIssuingBank();
            issuingBankPage = new IssuingBankPage(webDriver);
            issuingBankPage.fillFormIssuingBank("112233");
    }
}
