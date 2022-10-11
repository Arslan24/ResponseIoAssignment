package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebElement element;

	By add_To_Cart = By.cssSelector("button[name='Submit'] span");
	By item_selection = By.linkText("Blouse");
	By category_Selection = By.linkText("Popular");
	By cart_Quantity = By.xpath("//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]");

	public CartPage(WebDriver driver) {

		this.driver = driver;
	}

	public String validate_Category() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String categoryResult = driver.findElement(item_selection).getText();
		System.out.println("search reuslts " + categoryResult);
		return categoryResult;
	}

	public void mouseHover() {
		System.out.println("In click_search_mousehover");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(item_selection)).click().perform();
	}

	public void add_Cart() {
		System.out.println("In add to the cart");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(add_To_Cart)).click().perform();

	}

	public boolean validate_results() {
		String matchText = "1";
		String cartQuanity = driver.findElement(cart_Quantity).getText();
		System.out.println("Quanity in the cart " + cartQuanity);
		if (matchText.equals(cartQuanity)) {
			return true;
		}
		return false;
	}

}
