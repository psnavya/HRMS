package com.hrms.testautomation.leaves;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
    private WebElement userNameText;

    @FindBy(id="txtPassword")
    private WebElement passwordText;

    @FindBy(id="btnLogin")
    private WebElement loginButton;

    public void enterUsername(String userName) {
        userNameText.sendKeys(userName);
    }

    public void enterPassword(String password) {
        userNameText.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
