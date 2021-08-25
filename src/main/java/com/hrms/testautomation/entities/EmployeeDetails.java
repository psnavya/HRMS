package com.hrms.testautomation.entities;

public class EmployeeDetails{
    public String employeeName;
    public LeaveDetails leaveDetails;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LeaveDetails getLeaveDetails() {
        return leaveDetails;
    }

    public void setLeaveDetails(LeaveDetails leaveDetails) {
        this.leaveDetails = leaveDetails;
    }
}