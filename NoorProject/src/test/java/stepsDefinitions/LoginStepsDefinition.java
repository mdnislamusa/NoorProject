package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinition extends BaseTest{
	
	@Given("Open application")
	public void Open_application() {
		navigateAppUrl("url");

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[@class='ui fluid large blue submit button']")).click();
	}

	@Then("validate user is in application home page")
	public void validate_user_is_in_application_home_page() {
		
	}

}
