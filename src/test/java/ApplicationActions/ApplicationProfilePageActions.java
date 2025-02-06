package ApplicationActions;

import org.testng.Assert;

import ApplicationLocators.ApplicationProfilePageLocators;
import MyUtility.ApplicationBaseClass;

public class ApplicationProfilePageActions extends ApplicationBaseClass{
	ApplicationProfilePageLocators applicationProfilePageLocators= new ApplicationProfilePageLocators();
	
	public void Verify_user_can_Login_Successfully() {
		boolean VLogin = applicationProfilePageLocators.VerifyLogin.isDisplayed();
		Assert.assertTrue(VLogin);
		
		applicationProfilePageLocators.LoginOut.click();
		
	}

}
