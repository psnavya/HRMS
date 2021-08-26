Feature: StepLibrary for reference

  Scenario: LoginPageSteps
    * i log in with username "{string}" and password "{string}"

  Scenario: LeaveEntitlementPageSteps
    * i navigate to add leave entitlement tab
    * i enter employee name in leave entitlement page
    * i select entitlements leave type in leave entitlement page
    * i click Save button in leave entitlement page
    * i click OK button in Confirm Leave assignment popup


  Scenario: AssignLeavePageSteps
    * i navigate to assign leave tab
    * i enter employee name in assign leave page
    * i select random leave type in assign leave page
    * i enter date range in assign leave page
    * i click Assign button in assign leave page
    * i click Save in assign leave page


  Scenario: LeaveListPageSteps
    * i navigate to view leave list tab
    * i select all checkbox in leave list page
    * i click Search button in leave list page
    * i cancel leave in case of insufficient balance