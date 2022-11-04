package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;

	public void intializeDriver() throws IOException {

//FileInputStream fis = new FileInputStream("C:\\Users\\abhic\\eclipse-workspace\\TestNGproject\\src\\main\\java\\resources\\data.properties");

//modification---common path to run the code in any machine 
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		// to access the data.properties file
		prop = new Properties();

		// loading the readed file into prop
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver","C:\\Users\\abhic\\Desktop\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");

//modification---if chrome version is upadated----we use WebDriverManager
			// WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); // To run with specific version
			WebDriverManager.chromedriver().setup(); // To run with latest browser
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
	
			// code for firefox
		} else if (browserName.equalsIgnoreCase("edge")) {
			// code for edge
		} else {
			System.out.println("Enter valid browser");
		}
	}

//modification---to run the code before each method
	@BeforeMethod()
	public void LaunchURL() throws IOException {
		intializeDriver();
		// driver.get("https://login.salesforce.com/");
//modification---for not showing the url in script
		String url = prop.getProperty("url");
		driver.get(url);
	}
}