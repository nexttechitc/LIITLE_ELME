Feature: This is login feature


Scenario: Verify user can Login

Given Launch "<URL>" Application 
When Click LoginLink
When Enter UserNPassword Click LoginButton
Then Verify user can Login Successfully