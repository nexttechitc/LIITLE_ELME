package ApplicationStepDeffination;

import ApplicationActions.ApplicationHomePageActions;
import ApplicationActions.ApplicationRegisterPageActions;
import MyUtility.ApplicationBaseClass;
import MyUtility.ApplicationUtility;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationRegister extends ApplicationBaseClass{
	ApplicationHomePageActions applicationHomePageActions = new ApplicationHomePageActions();
	ApplicationRegisterPageActions applicationRegisterPageActions = new ApplicationRegisterPageActions();
	
	@When("^Click RegisterLink$")
	public void click_RegisterLink() throws Throwable {
		applicationHomePageActions.ClickRegisterLink();
	}
	@When("^Select Gender Enter FirstName Enter LastName Enter Email$")
	public void select_Gender_Enter_FirstName_Enter_LastName_Enter_Email() throws Throwable {
		applicationRegisterPageActions.Gender_FirstName_LastName_Email(); 
	}

	@When("^Enter Password Enter ConfirmPassword Click Register Button$")
	public void enter_Password_Enter_ConfirmPassword_Click_Register_Button() throws Throwable {
		applicationRegisterPageActions.Enter_PasswordConfirmPassword_ClickRegisterButton();
	}

	@Then("^Verify user registration$")
	public void verify_user_registration() throws Throwable {
		applicationRegisterPageActions.Verify_user_registration();
		ApplicationUtility.takeMyScreenshot(driver, "Registration Success Message");
	}



}
