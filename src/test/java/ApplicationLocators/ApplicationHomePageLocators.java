package ApplicationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyUtility.ApplicationBaseClass;

public class ApplicationHomePageLocators extends ApplicationBaseClass{
	
	public ApplicationHomePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//a[text()='Log in']")
	public WebElement LoginLink;
	
	@FindBy(linkText  = "Register")
	public WebElement RegisterLink;
	
	
	

}


