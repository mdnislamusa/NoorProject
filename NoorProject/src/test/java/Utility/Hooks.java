package Utility;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	public static BaseTest driver;
	
	@BeforeAll
	public static void setUp() throws Exception {
		driver = new BaseTest();
		driver.launchBrowser("browser");
	}
	
	@AfterAll
	public static void tearDown() throws Exception {
		driver.closeBrowser();
	}

}
