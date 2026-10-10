package e2e;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.Constants;
import pages.Cart_Page;
import pages.Login_Page;

public class Cart_e2e {
	
	WebDriver driver;
	Cart_Page cart;
	
	
	@BeforeMethod
	public void setup() {
		driver = library.Browsers.launchBrowser("Firefox");
		driver.get(Constants.URL);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
	@Test
	public void Navigate_Cart_Page() {
		cart = new Cart_Page(driver);
		cart.userLogin(Constants.USERNAME,Constants.PASSWORD);
		cart.navigateToCartPage();
		cart.removeItemViaCartPage();
	}

}
