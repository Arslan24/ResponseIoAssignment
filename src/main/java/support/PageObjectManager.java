package support;

import org.openqa.selenium.WebDriver;

import pages.CartPage;
import pages.HomePage;
import pages.MaintainCounter;
import pages.SearchItem;

public class PageObjectManager {
	
	WebDriver driver;
	private HomePage homePage;
	private CartPage cartpage;
	private MaintainCounter maintainCounter;
	private SearchItem searchItem;
	
	public PageObjectManager(WebDriver driver) {	 
		 this.driver = driver;
		 
		 }
	
	public MaintainCounter MaintainCounter() {
		
		 return (maintainCounter == null) ? maintainCounter = new MaintainCounter() : maintainCounter;
	}

	public HomePage getHomePage() {
		
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public CartPage getCartPage() {
		
		 return (cartpage == null) ? cartpage = new CartPage(driver) : cartpage;
	}
	
	public SearchItem getSearchItem () {
		return (searchItem == null) ? searchItem = new SearchItem(driver) : searchItem;
	}
}
