package ApplicationTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import MyUtility.ApplicationBaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/MyAllFeatureFile"},
plugin = {"json:target/cucumber.json"},
glue = "ApplicationStepDeffination")//,//tags = {"@JahanTest"})
public class Application_Test_Runner extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void ApplicationStart(){
		ApplicationBaseClass test = new ApplicationBaseClass();
		test.ApplicationBrowser();
		
	}
	@AfterTest
	public void ApplicationClose() {
		ApplicationBaseClass test = new ApplicationBaseClass();
		test.driver.quit();
		
	}
}
