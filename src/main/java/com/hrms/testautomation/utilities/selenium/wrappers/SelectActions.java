package com.hrms.testautomation.utilities.selenium.wrappers;

import org.openqa.selenium.WebElement;

public interface SelectActions {
      void selectValueFromDropdown(String value, WebElement we);
      void selectIndexFromDropdown(int i,WebElement we) ;

}
