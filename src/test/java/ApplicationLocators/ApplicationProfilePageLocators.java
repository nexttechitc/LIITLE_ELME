package ApplicationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyUtility.ApplicationBaseClass;

public class ApplicationProfilePageLocators extends ApplicationBaseClass{
	
	public ApplicationProfilePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText  = "mohammad.jahan@test.com")
	public WebElement VerifyLogin;
	@FindBy(linkText  = "Log out")
	public WebElement LoginOut;
	

}
