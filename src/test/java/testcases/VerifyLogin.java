package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.Constant;

public class VerifyLogin extends BaseClass {

	@Test
	public void login() throws IOException {

		LoginPageObjects obj1 = new LoginPageObjects(driver);

		obj1.enterUsername().sendKeys(Constant.username);
		
		//CommonUtilities.handlExplictWait(5, obj1.enterPassword());
		
		obj1.enterPassword().sendKeys(Constant.password);
		
		//CommonUtilities.handlExplictWait(10,obj1.clickOnLogin());
		
		obj1.clickOnLogin().click();
		
		obj1.clickOnTryForFree().click();
		
		CommonUtilities.handleAssertion(Constant.expectedString, obj1.actualError().getText());

		
		

		

	}

}
