package ApplicationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyUtility.ApplicationBaseClass;

public class ApplicationLoginPageLocators extends ApplicationBaseClass {
	
	public ApplicationLoginPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id  = "Email")
	public WebElement Email;
	
	@FindBy(id  = "Password")
	public WebElement Password;
	
	@FindBy(xpath  = "//input[@class=\"button-1 login-button\"]")
	public WebElement LoginButton;
	
	

}


