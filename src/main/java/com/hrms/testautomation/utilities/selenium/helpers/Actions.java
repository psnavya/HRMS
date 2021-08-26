package com.hrms.testautomation.utilities.selenium.helpers;

import com.hrms.testautomation.utilities.selenium.wrappers.ActionsInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class Actions implements ActionsInterface {
    public void hoverOn(WebElement we,WebDriver driver)
    {
        org.openqa.selenium.interactions.Actions actions=new org.openqa.selenium.interactions.Actions(driver);
        actions.moveToElement(we).perform();

    }

}
