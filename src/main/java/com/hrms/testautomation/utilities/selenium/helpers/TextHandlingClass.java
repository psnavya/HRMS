package com.hrms.testautomation.utilities.selenium.helpers;

import com.hrms.testautomation.utilities.selenium.wrappers.TextHandlingActions;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TextHandlingClass implements TextHandlingActions {
    @Override
    public  void enterText(String value, WebElement we) {
       we.sendKeys(value);
    }
    @Override
    public  void verifyText(String expectedValue, WebElement we) {
        Assert.assertEquals("Valid data present",expectedValue,we.getText());
    }

}
