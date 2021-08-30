package com.hrms.testautomation.utilities.selenium.wrappers;

import com.hrms.testautomation.utilities.managers.FileReaderManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public interface WaitActions{
    public  void untilJqueryIsDone(WebDriver driver);
    void untilPageLoadComplete(WebDriver driver);
    void untilPageLoadComplete(WebDriver driver, Long timeoutInSeconds);
    void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition);
    void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds);/*
    void waitForElementToAppear(WebElement webElement,WebDriver driver);*/
}
