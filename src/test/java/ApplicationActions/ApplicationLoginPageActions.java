package ApplicationActions;

import ApplicationLocators.ApplicationLoginPageLocators;
import MyUtility.ApplicationBaseClass;

public class ApplicationLoginPageActions extends ApplicationBaseClass{
	ApplicationLoginPageLocators applicationLoginPageLocators = new ApplicationLoginPageLocators();
	
	public void userLogin(String u, String p) {
		applicationLoginPageLocators.Email.sendKeys(u);
		applicationLoginPageLocators.Password.sendKeys(p);
		applicationLoginPageLocators.LoginButton.click();
		
		
	}

}
