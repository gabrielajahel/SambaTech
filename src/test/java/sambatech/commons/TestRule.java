package sambatech.commons;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {
	public static  WebDriver driver;
		
	@Before
	public void beforeTestCase() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/gabi/AppData/Local/Google/Chrome/User Data");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://web1.qa.sambatech.com:10000/");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@After
	public void afterCenario (Scenario cenario) {
	if (driver != null) {
		driver.close();
	}
	}
	

}