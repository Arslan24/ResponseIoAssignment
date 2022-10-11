package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {

		this.driver = driver;
		System.out.println("\n" + " Home PAGE ==>> "  + " Driver :: " + driver + "\n" );
	} 
	
	//Return home page message i.e: No Item is Selected. Please use the search bar above to search for an item.
	public String get_Homepage_msg() {
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			String msg = "User is on a HomePage";
			return msg;
		}
		catch(Exception e) {
			return null;
		}
	}
}
