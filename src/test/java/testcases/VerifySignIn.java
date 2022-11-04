package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignInPageObjects;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.Constant;

public class VerifySignIn extends BaseClass {
	@Test
	public void SignIn() throws IOException, InterruptedException {

		LoginPageObjects obj1 = new LoginPageObjects(driver);
		obj1.clickOnTryForFree().click();

		SignInPageObjects obj2 = new SignInPageObjects(driver);

		Thread.sleep(2000);

		obj2.enterFirstName().sendKeys(Constant.firstName);
		obj2.enterLasstName().sendKeys(Constant.lastName);
		obj2.enterjobTitle().sendKeys(Constant.jobTitle);
		obj2.enteremail().sendKeys(Constant.email);
		obj2.enterPhone().sendKeys(Constant.phone);
		obj2.enterCompany().sendKeys(Constant.company);
		obj2.clickOnCheckbox().click();

		CommonUtilities.handleStaticDropdown(obj2.selectEmployee(), 1);

		Thread.sleep(2000);

		CommonUtilities.handleStaticDropdown(obj2.selectCountry(), 2);

	}

}
