package ApplicationActions;

import org.testng.Assert;

import ApplicationLocators.ApplicationRegisterPageLocators;
import MyUtility.ApplicationBaseClass;
import MyUtility.ApplicationTestData;

public class ApplicationRegisterPageActions extends ApplicationBaseClass{
	ApplicationRegisterPageLocators applicationRegisterPageLocators= new ApplicationRegisterPageLocators();
	
	public void Gender_FirstName_LastName_Email() throws InterruptedException {
		Thread.sleep(4000);
		applicationRegisterPageLocators.Gender.click();
		applicationRegisterPageLocators.FirstName.sendKeys(ApplicationTestData.FirstName);
		applicationRegisterPageLocators.LastName.sendKeys(ApplicationTestData.LastName);
		applicationRegisterPageLocators.RegisterEmail.sendKeys(ApplicationTestData.REami);
	}
	public void Enter_PasswordConfirmPassword_ClickRegisterButton() {
		applicationRegisterPageLocators.RPassword.sendKeys(ApplicationTestData.RPassword);
		applicationRegisterPageLocators.RConfirmPassword.sendKeys(ApplicationTestData.RPassword);
		applicationRegisterPageLocators.ResisterBitton.click();
	}
	public void Verify_user_registration() {
		boolean CRegistration=  applicationRegisterPageLocators.ResisterCmplrate.isDisplayed();
		Assert.assertTrue(CRegistration);
		
		
		
	}

}
