package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {
	
	WebDriver driver;
	
	public Cart_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	By usernameField = By.xpath("//input[@id='user-name']");
	By passwordField = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");
	By addToCartButtonTTR = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	By addToCartButtonSBP = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By cartIcon = By.xpath("//a[@data-test='shopping-cart-link']");
	By removeButtonSBP = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	By removeButtonTTR = By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']");
	
	
	public void userLogin(String username, String password) {
		driver.findElement(usernameField).click();
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).click();
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		}
	
	public void navigateToCartPage() {
		// Add item(s) to cart:
		driver.findElement(addToCartButtonSBP).click();
		driver.findElement(addToCartButtonTTR).click();
		// Now navigate to Cart page
		driver.findElement(cartIcon).click();
	}
	
	public void removeItemViaCartPage() {
		driver.findElement(removeButtonSBP).click();
		driver.findElement(removeButtonTTR).click();
	}

}
