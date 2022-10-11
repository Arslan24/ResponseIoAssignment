package testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import support.DriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFiles/01SearchItem.feature", glue = { "stepDefination" }, plugin = {
		"html:target/cucumber-html-report", "json:target/cucumber/cucumber.json", "json:target/cucumber/cucumber.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner {

	static WebDriver driver;

	@AfterClass
	public static void close_browser() {
		System.out.println("\n  Close Browser  \n ");

		DriverManager.closeDriver();

	}
}
