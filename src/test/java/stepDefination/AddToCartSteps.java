package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.MaintainCounter;
import support.ConfigReader;
import support.DriverManager;

public class AddToCartSteps {

	TestContext testContext;
	CartPage cartPage;
	HomePage homepage;
	MaintainCounter maintainCounter;
	WebDriver driver;

	public AddToCartSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
		homepage = testContext.getPageObjectManager().getHomePage();
		maintainCounter = testContext.getPageObjectManager().MaintainCounter();

	}

	@Given("User is at  homePage")
	public void the_user_is_on_homepage() {
		maintainCounter.increment();
		System.out.println("\n Counter :: " + maintainCounter.getCounter() + "\n");
		if (maintainCounter.getCounter() == 1) {
			driver = DriverManager.getDriver();
			driver.get(ConfigReader.getInstance().getBaseUrl());
			driver.manage().window().maximize();
		}
		String message = homepage.get_Homepage_msg();
		driver.navigate().to("http://automationpractice.com/index.php");

		System.out.println(message);
	}

	@When("user Select any item from from the {string} section and add them to the cart")
	public void item_add_to_Cart(String itemSelected ) {

		String category_section_Title = cartPage.validate_Category();
		
		System.out.println("title given from search choose_Category_Popoular " + category_section_Title);

		Assert.assertEquals(itemSelected, category_section_Title);

		if (category_section_Title.equals(itemSelected)){
			
			cartPage.mouseHover();
			 cartPage.add_Cart();
		}
		else {
			System.out.println("item select is not matching ");
		}
	
	}

	@Then("Validate that the item has successfully been added to the cart")
	public void validate_match_results() {
		 cartPage.validate_results();
	}
}
