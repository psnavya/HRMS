package com.hrms.testautomation.utilities.selenium;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions {
  WebDriver driver;


    public static void hoverOn(WebElement we,WebDriver driver)
    {
        org.openqa.selenium.interactions.Actions actions=new org.openqa.selenium.interactions.Actions(driver);
        actions.moveToElement(we).perform();

    }

}
