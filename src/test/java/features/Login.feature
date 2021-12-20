
Feature: Login Validation

@SmokeTest
Scenario: Validate the user login with valid credentials
          Given user is on Login page
          When user enters correct username "wasim" and password "123"
          And clicks on submit
          Then user is navigated to Homepage sucessfully
    
    @Regression      
 Scenario: Validate the user login with invalid credentials
          Given user is on Login page
          When user enters the correct username "Akram" and password "456"
          And clicks on submit
          Then user is navigated to Homepage sucessfully
          
   @Regression
  Scenario: Fill the signup form
          Given user is on Login page
          When user enters the following details
          |firstname1|LastName1|DOB1|Age1|
          |firstname2|LastName2|DOB2|Age2|
          And clicks on submit
          Then user is navigated to Homepage sucessfully   
          
   @Regression       
  Scenario: Validate the user login credentials with different set of data
          Given user is on Login page
          When user enters correct username <Username> and password <Password>
          And clicks on submit
          Then user is navigated to Homepage sucessfully
          
 Examples:
     |Username|Password|
     |user1   |Pwd1|
      |user2  |Pwd2|
      |user3  |Pwd3|
      |user4   |Pwd4|
 