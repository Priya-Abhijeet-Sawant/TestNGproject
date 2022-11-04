package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	public static WebDriver driver;
	
//for handling dropdown
	public static void handleStaticDropdown(WebElement element, int index) {
		WebElement e =element;
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	
//for handling assertion	
	public static void handleAssertion(String expected, String actual) {
		SoftAssert sa = new SoftAssert();
		String ExpectedString=expected;
		String ActualString=actual;
		sa.assertEquals(ActualString, ExpectedString);
		sa.assertAll();
	}
	
//explicit wait	
	public static void handlExplictWait(int duration, WebElement element ) {
		  
	    WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
	    wb.until(ExpectedConditions.visibilityOf(element));
	}
}
