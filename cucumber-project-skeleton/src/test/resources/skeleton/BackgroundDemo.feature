Feature: Application test 
 
 Background:
 Given user in the TestMe App home page
 
 Scenario: user can do the successful login
 Given user is in login page
 When  user provides correct credentials
 Then  user render to TestMeApp home page
 
 Scenario: user Registration
 Given user is on the register page
 When  user provides correct credentials
 Then  user rendered to TestMeApp login page
 