package com.hrms.testautomation.utilities.selenium.helpers;

import org.openqa.selenium.WebElement;

public class Select {

    public static void selectValueFromDropdown(String value, WebElement we) {
        org.openqa.selenium.support.ui.Select select=new org.openqa.selenium.support.ui.Select(we);
        select.selectByValue(value);
    }
    public static void selectIndexFromDropdown(int i,WebElement we) {
        org.openqa.selenium.support.ui.Select select=new org.openqa.selenium.support.ui.Select(we);
        select.selectByIndex(i);
    }
}
