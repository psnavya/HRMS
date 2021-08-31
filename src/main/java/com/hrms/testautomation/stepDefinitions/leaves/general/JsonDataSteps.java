package com.hrms.testautomation.stepDefinitions.leaves.general;
import com.hrms.testautomation.entities.EmployeeDetails;
import com.hrms.testautomation.utilities.cucumber.TestContext;
import com.hrms.testautomation.utilities.managers.FileReaderManager;
import cucumber.api.java.en.Given;

public class JsonDataSteps {
    TestContext context;
    EmployeeDetails employeeDetails;
    public static EmployeeDetails testData;
    public  JsonDataSteps( TestContext context,EmployeeDetails employeeDetails) {
        this.context = context;
        this.employeeDetails =employeeDetails;
    }

    @Given("^i am user \"([^\"]*)\"$")
    public  void iAmUser(String arg1)  {
       /* EmployeeDetails employeeDetails=jsonDataReader.getEmployeeByName(arg1);

        jsonDataReader.setEmployeeName(employeeDetails);*/
      //  employeeDetails.setEmployeeName(arg1);
        //employeeDetails.getEmployeeByName( arg1);

        employeeDetails = FileReaderManager.getInstance().getJsonReader().getEmployeeByName(arg1);
        testData= employeeDetails;

      /*  jsonDataReader.getCustomerByName("Jennifer Lawrence");
        jsonDataReader.getCustomerData().get(0);*/
    }
}
