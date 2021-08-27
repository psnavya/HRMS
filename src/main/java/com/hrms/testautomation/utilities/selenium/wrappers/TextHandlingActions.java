package com.hrms.testautomation.utilities.selenium.wrappers;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public interface TextHandlingActions {
      void enterText(String value, WebElement we);
    void verifyText(String expectedValue, WebElement we) ;
}
