package ApplicationStepDeffination;

import ApplicationActions.ApplicationHomePageActions;
import ApplicationActions.ApplicationLoginPageActions;
import ApplicationActions.ApplicationProfilePageActions;
import MyUtility.ApplicationBaseClass;
import MyUtility.ApplicationUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Appli8cationLogin extends ApplicationBaseClass{
	ApplicationHomePageActions applicationHomePageActions = new ApplicationHomePageActions();
	ApplicationLoginPageActions applicationLoginPageActions = new ApplicationLoginPageActions();
	ApplicationProfilePageActions applicationProfilePageActions = new ApplicationProfilePageActions();
	
	@Given("^Launch \"([^\"]*)\" Application$")
	public void launch_Application(String URL) throws Throwable {
		ApplicationURL(URL);
		ApplicationUtility.takeMyScreenshot(driver, "Home Page");
	}
	@When("^Click LoginLink$")
	public void click_LoginLink() throws Throwable {
		applicationHomePageActions.Click_LoginLink();
	}

	@When("^Enter UserNPassword Click LoginButton$")
	public void enter_UserNPassword_Click_LoginButton() throws Throwable {
		applicationLoginPageActions.userLogin(AppProp.getProperty("UserID"),AppProp.getProperty("UserPW"));
	}

	@Then("^Verify user can Login Successfully$")
	public void verify_user_can_Login_Successfully() throws Throwable {
		applicationProfilePageActions.Verify_user_can_Login_Successfully();
		ApplicationUtility.takeMyScreenshot(driver, "Profile Page");
	}



}
