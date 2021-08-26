package com.hrms.testautomation.utilities.selenium.helpers;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TextHandling {
    public static void enterText(String value, WebElement we) {
       we.sendKeys(value);
    }
    public  void verifyText(String expectedValue, WebElement we) {
        Assert.assertEquals("Valid data present",expectedValue,we.getText());
    }

}
