package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchItem {
	WebDriver driver;
	WebElement element;
	By search_field = By.id("search_query_top");
	By submit_Search = By.name("submit_search");
	By validate_text = By.cssSelector(".lighter");
	By select_category_women = By.cssSelector("a[title='Women']");
	By catergory_filet_label = By.cssSelector("label[for='layered_category_8']"); 
	By check_category = By.id("layered_id_attribute_group_16");
	By color_filter_label = By.xpath("//label[@name='layered_id_attribute_group_16']//a[1]");
	By color_Filter = By.cssSelector("#layered_id_attribute_group_16"); 

	public SearchItem(WebDriver driver) {

		this.driver = driver;
		System.out.println("\n" + " Home PAGE ==>> " + " Driver :: " + driver + "\n");
	}

	/*
	 * Users are able to search for an item using the search bar
	 */

	public void enter_search(String txt) {
		System.out.println("Enter the search text");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("In click_search_icon before");
		driver.findElement(search_field).sendKeys(txt);
		wait.until(ExpectedConditions.elementToBeClickable(search_field));
		System.out.println("In click_search_icon after");
		System.out.println(txt);
	}

	public void click_serach_icon() {
		System.out.println("In click_search_icon");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(submit_Search)).click().perform();

	}

	public String validate_reults() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String serachResult = driver.findElement(validate_text).getText();
		System.out.println("search reuslts " + serachResult);
		return serachResult;
	}

	/// ENDING///////////

	/*
	 * Users are able to filter search results under Women category by Color and
	 * Category
	 */

	public void scroll_Down(WebDriver driver) {
		System.out.println("click scroll");
		JavascriptExecutor exectuor = (JavascriptExecutor) driver;
		exectuor.executeScript("window.scrollBy(0,2000)", "");
		WebDriverWait wait = new WebDriverWait(driver, 20);

	}
	
	public String validate_Category() {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		String categoryResult = driver.findElement(select_category_women).getText();
		System.out.println("search reuslts " + categoryResult);
		return categoryResult;
	}
	
	public String validate_Category_filter() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String[] category_result_Filter = driver.findElement(catergory_filet_label).getText().split(" ");
		String categories_filter = category_result_Filter[0];
		System.out.println("search reuslts categories " + categories_filter);
		
		return categories_filter;
	}

	
	public String validate_Category_Color() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		String[] category_result_Color = driver.findElement(color_filter_label).getText().split(" ");
		String color_filter1 = category_result_Color[0];
		System.out.println("search reuslts color " + color_filter1);
		return color_filter1;
	}

	public void choose_category() {
		System.out.println("In click choose category women");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(select_category_women)).click().perform();
	}

	public void  apply_category_filter() {
		System.out.println("In apply filters category");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(check_category)).click().perform();

	}

	public void apply_color_filter() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

		System.out.println("In apply filters color");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(color_Filter)).click().perform();
	}

	////// ENDING ////////

}
