package context;

import support.DriverManager;
import support.PageObjectManager;

public class TestContext {
	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		webDriverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(DriverManager.getDriver());
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}
