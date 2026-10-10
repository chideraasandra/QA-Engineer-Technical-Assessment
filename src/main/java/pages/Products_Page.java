package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Products_Page {
	
	WebDriver driver;
	
	public Products_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
		By usernameField = By.xpath("//input[@id='user-name']");
		By passwordField = By.xpath("//input[@id='password']");
		By loginButton = By.xpath("//input[@id='login-button']");
		//Products page locators
		By sortDropdown = By.xpath("//select[@data-test='product-sort-container']");
		By onesieAddToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
		By addToCartButtonTTR = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
		By addToCartButtonSBP = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
		By cartBadgeCountP = By.xpath("//span[@data-test='shopping-cart-badge']");
		By removeFromCartTTR = By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']");
		By cartBadgeCountN = By.xpath("//span[@data-test='shopping-cart-badge']");
		By removeFromCartSBP = By.xpath("//button[@id='remove-sauce-labs-backpack']");
		By cartIcon = By.xpath("//a[@data-test='shopping-cart-link']");
		By productList = By.xpath("//div[@data-test='inventory-item']");
		By productListPrice = By.xpath("//div[@data-test='inventory-item-price']");
		By productListName = By.xpath("//div[@data-test='inventory-item-name']");
		
		public void userLogin(String username, String password) {
			driver.findElement(usernameField).click();
			driver.findElement(usernameField).sendKeys(username);
			driver.findElement(passwordField).click();
			driver.findElement(passwordField).sendKeys(password);
			driver.findElement(loginButton).click();
			}
		
		public void productListSort(String sortOption) {
		//According to Chat this next line is not necessary as the dropdown is a native <select>, Selenium interacts with it directly, Unlike a custom UI dropdown
	        //driver.findElement(sortDropdown).click();
			
			WebElement productSortDropdown = driver.findElement(sortDropdown);
			Select select = new Select(productSortDropdown);
			
			select.selectByVisibleText(sortOption);
			
		}
		
		// This method is still a work-in-progress
		public void validateSortResult() throws Exception{
			List <WebElement> productSortList = driver.findElements(productListPrice); // Here change locator depending on the filter option being tested for, name or price
			int count = productSortList.size();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for(int i = 0; i < count; i++) {
				
				Thread.sleep(1000);;
				js.executeScript("arguments[0].scrollIntoView();", productSortList.get(i));
				
				String text = productSortList.get(i).getText();
				
				System.out.println(text);
			}
			
		}
			
		//public void addToCart() {
			//driver.findElement(addToCartButtonTTR).click();
			//driver.findElement(addToCartButtonSBP).click();
			
			//String text = driver.findElement(cartBadgeCountP).getText();
			
			//System.out.println(text);
		//}
		
		
		//public void removeFromCart() {
			//driver.findElement(removeFromCartTTR).click();
			
			//String text = driver.findElement(cartBadgeCountN).getText();
			
			//System.out.println(text);
			
			//driver.findElement(removeFromCartSBP).click();	
		//}
}
