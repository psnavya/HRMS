package com.hrms.testautomation.utilities.selenium.helpers;

import com.cucumber.listener.Reporter;
import com.hrms.testautomation.utilities.selenium.wrappers.HoverActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class HoverClass implements HoverActions {
    @Override
    public void hoverOn(WebElement we, WebDriver driver) {
        try {
            org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
            actions.moveToElement(we).perform();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            Reporter.addStepLog("Hovering not done correctly");
        }
    }

}
