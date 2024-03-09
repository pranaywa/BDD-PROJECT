package testFeature;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage p = new LoginPage(DriverFactory.getDriver());
	@Given("User is at login page")
	public void user_is_at_login_page() {
		driver = DriverFactory.getDriver();
		driver.get("https://rahulshettyacademy.com/client");
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		p.clickOnLoginButton();
	}

	@Then("User enters to the application")
	public void user_enters_to_the_application() {
		String title =p.ValidateTitle();
		assertEquals(title,"Let's Shop");
	}
}
