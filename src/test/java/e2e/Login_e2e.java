package e2e;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.Constants;
import pages.Login_Page;

public class Login_e2e {
	
	WebDriver driver;
	Login_Page login;
	
	@BeforeMethod
	public void setup() {
		driver = library.Browsers.launchBrowser("Firefox");
		driver.get(Constants.URL);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void Login() {
		login = new Login_Page(driver);
		login.userLogin(Constants.LOCKED_OUT_USER,Constants.PASSWORD);
	}

}
