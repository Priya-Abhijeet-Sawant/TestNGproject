package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
	By username = By.xpath("//input[@id=\"username\"]");
	By password = By.xpath("//input[@id=\"password\"]");
	By logIn = By.xpath("//input[@id=\"Login\"]");
	By tryForFree = By.xpath("//a[@id='signup_link']");
	By AtualErrorMsg=(By.xpath("//div[@id='error']"));
	
	public LoginPageObjects(WebDriver driver2) {	//constructor is created here to give the scope to driver in VerifyLogin class
		this.driver = driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(logIn);
	}

	public WebElement clickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
	public WebElement actualError() {
		return driver.findElement(AtualErrorMsg);
	}
	
}
