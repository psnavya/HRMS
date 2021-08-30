package com.hrms.testautomation.utilities.selenium.helpers;

import com.hrms.testautomation.utilities.selenium.wrappers.SelectActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass implements SelectActions {
@Override
    public  void selectValueFromDropdown(String value, WebElement we) {
        Select select=new Select(we);
        select.selectByValue(value);
    }
    @Override
    public  void selectIndexFromDropdown(int i,WebElement we) {
        org.openqa.selenium.support.ui.Select select=new org.openqa.selenium.support.ui.Select(we);
        select.selectByIndex(i);
    }
}
