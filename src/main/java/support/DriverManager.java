package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.DriverType;
import enums.EnviornmentType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	public static WebDriver driver;
	public static WebDriver driver1;

	private static DriverType driverType;
	private static EnviornmentType environmentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public DriverManager() {
		driverType = ConfigReader.getInstance().getBrowser();
		environmentType = ConfigReader.getInstance().getEnvironment();
	}
	public static WebDriver getDriver() {

		System.out.print("Get driver :: " + driver);

		if(driver == null) driver = createDriver();
		return driver;
	}
	private static WebDriver createDriver() {
		switch (environmentType) {	    
		case LOCAL : driver = createLocalDriver();
		break;
		case REMOTE : driver = createRemoteDriver();
		break;
		}
		return driver;
	}

	private static WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	private static WebDriver createLocalDriver() {
		switch (driverType) {	    
		case FIREFOX : driver = new FirefoxDriver();
		break;
		case CHROME : 


			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			/*System.setProperty(CHROME_DRIVER_PROPERTY, ConfigReader.getInstance().getDriverPath());
	        ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			driver = new ChromeDriver(options);*/
			//driver = new ChromeDriver();
			//SessionId session =((ChromeDriver)driver).getSessionId();
			//System.out.println("\n"+"Session id: " + session.toString() +"\n");
			break;
		case INTERNETEXPLORER : driver = new InternetExplorerDriver();
		break;
		}

		return driver;
	}	

	public static void closeDriver() {
		driver.close();
		driver.quit();
	}
}
