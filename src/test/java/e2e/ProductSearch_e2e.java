package e2e;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import library.Constants;
import pages.Products_Page;

public class ProductSearch_e2e {

	WebDriver driver;
    Products_Page products;
	
	@BeforeMethod
	public void setup() {
		driver = library.Browsers.launchBrowser("firefox");
		driver.get(Constants.URL);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			Shutterbug.shootPage(driver).withName(result.getName()).save();
		}
		driver.quit();
	}
	
	@Test
	public void Navigate_Products_Page() throws Exception{
		products = new Products_Page(driver);
		products.userLogin(Constants.USERNAME,Constants.PASSWORD);
		products.productListSort("Price (high to low)");
		products.validateSortResult();
		//products.addToCart();
		//products.removeFromCart();
	}

}
