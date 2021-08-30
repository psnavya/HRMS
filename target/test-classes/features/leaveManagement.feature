
Feature: Automate adding a leave entitlement,assigning leave and cancelling of leave if insufficient leave balance.
Background:
  Given user is on Home Page
  And i log in with username "Admin" and password "admin123"

  @Run1
 Scenario Outline: Add Leave Entitlement
    #Values to be taken from json file
    Given i am user "<user>"
    #Given user is on Home Page
    #And i log in with username "Admin" and password "admin123"
    When i navigate to add leave entitlement tab
    And i enter employee name in leave entitlement page
    And i select leave type in leave entitlement page
    And i enter entitlement in leave entitlement page
    And i click Save button in leave entitlement page
    And i click OK button in Confirm Leave assignment popup
  Examples:
   |user|
   |Jennifer Lawrence|
    |Ross Geller|
@Run
 Scenario Outline: Assign Leave Entitlement
    #Values to be taken from json file
    Given i am user "<user>"
    When i navigate to assign leave tab
    And i enter employee name in assign leave page
    And i select random leave type in assign leave page
    And i enter date range in assign leave page
    And i click Assign button in assign leave page
    And i click Save in assign leave page
   Examples:
   |user|
     |Jeniffer Lawrence|
     |Ross Geller      |
@Run
 Scenario Outline: Cancelling of leave in case of insufficient leave balance.
    #Values to be taken from json file
    Given i am user "<user>"
   When i navigate to view leave list tab
    And i select all checkbox in leave list page
    And i click Search button in leave list page
    And i cancel leave in case of insufficient balance
   Examples:
   |user|
     |Jeniffer Lawrence|
     |Ross Geller      |
