package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	WebDriver driver;
	
	public Login_Page (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locators
	By usernameField = By.xpath("//input[@id='user-name']");
	By passwordField = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");
	By loginErrorMessage = By.xpath("//h3[@data-test='error']");
	
	
	public void userLogin(String username, String password) {
		driver.findElement(usernameField).click();
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).click();
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		// To capture the error messages for invalid username and/or password, and locked_out_user login attempts
		String text = driver.findElement(loginErrorMessage).getText();
		System.out.println(text);
		}
	
	
}
