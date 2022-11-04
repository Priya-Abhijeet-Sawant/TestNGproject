package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPageObjects {
	public WebDriver driver;
	By firstName=By.xpath("//input[@name=\"UserFirstName\"]");
	By lastName=By.xpath("//input[@name=\"UserLastName\"]");
	By jobTitle=By.xpath("//input[@name=\"UserTitle\"]");
	By email=By.xpath("//input[@name=\"UserEmail\"]");
	By employee=By.xpath("//select[@name=\"CompanyEmployees\"]"); 
	By phone=By.xpath("//input[@name=\"UserPhone\"]");
	By country=By.xpath("//select[@name=\"CompanyCountry\"]");
	By checkbox=By.xpath("(//div[@class=\"checkbox-ui\"])[1]");
	By company=By.xpath("//input[@name=\"CompanyName\"]");
	
	public SignInPageObjects(WebDriver driver2) {	//constructor is created here to give the scope to driver in VerifyLogin class
		this.driver = driver2;
	}

	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement enterLasstName() {
		return driver.findElement(lastName);
	}			
	public WebElement enterjobTitle() {
		return driver.findElement(jobTitle);
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement selectEmployee() {
		return driver.findElement(employee);
	}
	public WebElement enterPhone() {
		return driver.findElement(phone);
	}
	public WebElement selectCountry() {
		return driver.findElement(country);
	}	
	public WebElement clickOnCheckbox() {
		return driver.findElement(checkbox);
	}
	public WebElement enterCompany() {
		return driver.findElement(company);
	}
	}






