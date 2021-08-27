package com.hrms.testautomation.utilities.selenium.helpers;

import com.hrms.testautomation.utilities.selenium.wrappers.ClickActions;
import org.openqa.selenium.WebElement;

public class ClickClass implements ClickActions {
@Override
    public  void clickOn(WebElement we)
    {
        we.click();
    }
}
