package com.hrms.testautomation.utilities.selenium.wrappers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.function.Function;

public interface WaitActions{
    public  void untilJqueryIsDone(WebDriver driver);
    void untilPageLoadComplete(WebDriver driver);
    void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds);
    void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition);
    void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds);
    void waitForElementToAppear(WebElement webElement,WebDriver driver);
}
