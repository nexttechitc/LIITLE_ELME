package MyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationBaseClass {
	public static Properties AppProp;
	public static WebDriver driver;
	public ApplicationBaseClass() {
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\MyConfig\\ApplicationConfig.Properties");
			AppProp = new Properties();
			AppProp.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ApplicationBrowser() {
		
		String AllAppBrowser =  AppProp.getProperty("BrowserOne");
		if(AllAppBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\ChromeDriver2\\chromedriver.exe" );
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(); 
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ApplicationUtility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ApplicationUtility.implicitlyWait));
			driver.manage().window().maximize();  
		}
		else if(AllAppBrowser.equalsIgnoreCase("IE")) {
			
			
		}
		
		
	}
	public void ApplicationURL(String URL) {
		driver.get(AppProp.getProperty("BaseURL"));
		
	}

}
