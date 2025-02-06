package ApplicationActions;

import ApplicationLocators.ApplicationHomePageLocators;
import MyUtility.ApplicationBaseClass;

public class ApplicationHomePageActions extends ApplicationBaseClass {
	
	ApplicationHomePageLocators applicationHomePageLocators = new ApplicationHomePageLocators();
	public void Click_LoginLink() {
		applicationHomePageLocators.LoginLink.click();
	}
	public void ClickRegisterLink() {
		applicationHomePageLocators.RegisterLink.click();
		
	}
	

}
