Feature: This feature for user registration functionality

@Smoke
Scenario: Verify user registration

Given Launch "<URL>" Application
When Click RegisterLink
When Select Gender Enter FirstName Enter LastName Enter Email
When Enter Password Enter ConfirmPassword Click Register Button
Then Verify user registration

