package ApplicationLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MyUtility.ApplicationBaseClass;

public class ApplicationRegisterPageLocators extends ApplicationBaseClass {
	public ApplicationRegisterPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id  = "gender-male")
	public WebElement Gender;
	
	@FindBy(id  = "FirstName")
	public WebElement FirstName;
	
	@FindBy(name  = "LastName")
	public WebElement LastName;
	
	@FindBy(id  = "Email")
	public WebElement RegisterEmail;
	
	@FindBy(id  = "Password")
	public WebElement RPassword;
	@FindBy(name  = "ConfirmPassword")
	public WebElement RConfirmPassword;
	@FindBy(id  = "register-button")
	public WebElement ResisterBitton;
	
	@FindBy(xpath  = "//div[@class=\"result\"]")
	public WebElement ResisterCmplrate;
	
	

}
