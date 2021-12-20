@All
Feature: Title of your feature
  
  Background: Need to run before each scenario
     Given user clears the cache
     And initiated the browser
     
     

  @SmokeTest
  Scenario: Demo
          Given user is on Login page
          When user fills the form
          And clicks on submit
          Then user is navigated to Homepage sucessfully
   
  @Regression
  Scenario: Testing Demo
            Given user is on Login page
          When user fills the form
          And clicks on submit
          Then user is navigated to Homepage sucessfully
   
  
