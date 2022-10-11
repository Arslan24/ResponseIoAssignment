package stepDefination;

import org.openqa.selenium.WebDriver;
import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.MaintainCounter;
import pages.SearchItem;
import support.ConfigReader;
import support.DriverManager;

public class SearchItemSteps {
	TestContext testContext;
	SearchItem searchitem;
	HomePage homepage;
	MaintainCounter maintainCounter;
	WebDriver driver;

	public SearchItemSteps(TestContext context) {
		testContext = context;
		searchitem = testContext.getPageObjectManager().getSearchItem();
		homepage = testContext.getPageObjectManager().getHomePage();
		maintainCounter = testContext.getPageObjectManager().MaintainCounter();

	}

	/*
	 * Users are able to search for an item using the search bar
	 */

	@Given("User is navigate to homePage")
	public void the_user_is_on_homepage() {
		maintainCounter.increment();
		System.out.println("\n Counter :: " + maintainCounter.getCounter() + "\n");
		if (maintainCounter.getCounter() == 1) {
			driver = DriverManager.getDriver();
			driver.get(ConfigReader.getInstance().getBaseUrl());
			driver.manage().window().maximize();
		}
		String message = homepage.get_Homepage_msg();
		System.out.println(message);
	}

	@When("user type the {string} in the search bar")
	public void the_user_searched_Item(String Dress) {

		System.out.println("Search string" + Dress);

		if (maintainCounter.getCounter() == 1 || maintainCounter.getSearchedCount() == 0) {
			maintainCounter.searchInc();
			searchitem.enter_search(Dress);
			System.out.println("Select ");
		}
	}

	@Then("click on the search Icon")
	public void search_Click() {
		searchitem.click_serach_icon();
	}

	@And("{string} dress displayed")
	public void validate_search_Results(String searchTitle) {

		searchTitle = '"' + searchTitle + '"';
		String title = searchitem.validate_reults();

		System.out.println("title given from search " + title);
		Assert.assertEquals(searchTitle, title);

		driver.navigate().to("http://automationpractice.com/index.php");

	}

	/// ENDING///////////

	/*
	 * Users are able to filter search results under Women category by Color and
	 * Category
	 */

	@When("user click on {string} category")
	public void click_Category(String categoryTitle) {
		
		String titleCategory = searchitem.validate_Category();

		System.out.println("title given from search " + titleCategory);
		
		

		Assert.assertEquals(categoryTitle, titleCategory);

		if (categoryTitle.equals(titleCategory)){
			searchitem.choose_category();
		}
		else {
			System.out.println("Category is not matching");
		}
	}

	@Then("user select any value from the {string} and {string} filter item")
	public void choose_Category(String Color , String Category) {
		System.out.println("category selection of color and Categories ");
		
		
		String color_Filter = searchitem.validate_Category_Color();
		
		System.out.println("title given from search choose_Color " + color_Filter);


		if (color_Filter.equals(Color)){
			
			searchitem.apply_color_filter();
		}
		else {
			System.out.println("color is not matching choose_Category");
		}
		
		String categories_Filter = searchitem.validate_Category_filter();
		
		System.out.println("title given from search choose_Category " + categories_Filter);

		if (categories_Filter.equals(Category)){
			
			searchitem.apply_category_filter();

		}
		else {
			System.out.println("error Category is not matching choose_Category");
		}
		

		Assert.assertEquals(Color, color_Filter);
		Assert.assertEquals(Category, categories_Filter);
	}
	
	@And("Validate that the results returned matches the filter criteria")
	public void validate_filters_Applied(){
		System.out.println("category selection of color and Categories ");
		
		String Color = "Yellow";
		String Category = "Dresses";
		
		String color_Filter = searchitem.validate_Category_Color();
		
		System.out.println("title given from search choose_Color " + color_Filter);

		Assert.assertEquals(Color, color_Filter);
		
		
		String categories_Filter = searchitem.validate_Category_filter();
		
		System.out.println("title given from search choose_Category " + categories_Filter);

		Assert.assertEquals(Category, categories_Filter);
		
	}
	
	/// ENDING///////////


}
