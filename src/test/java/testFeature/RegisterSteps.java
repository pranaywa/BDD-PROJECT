package testFeature;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import qa.DriverFactory;
import utility.TimeValueGenerator;

public class RegisterSteps {
	
	WebDriver driver;
	RegisterPage r = new RegisterPage(DriverFactory.getDriver());
	
	@Given("User is at home page")
	public void user_is_at_home_page() {
		driver = DriverFactory.getDriver();
		driver.get("https://rahulshettyacademy.com/client");
	}

	@When("User click on the register button on home page")
	public void user_click_on_the_register_button_on_home_page() throws InterruptedException {
		Thread.sleep(1000);
		r.clickOnRegisterButton();
	}

	@Then("User navigate to the register page")
	public void user_navigate_to_the_register_page() {
		String title =r.validateTitleOfRegisterPage();
		assertEquals(title,"Let's Shop");
	}

	@When("User enter the first name as <{string}>")
	public void user_enter_the_first_name_as(String string) {
		r.firstname(string);
	}

	@When("User enter the last name as <{string}>")
	public void user_enter_the_last_name_as(String string) {
		r.lastname(string);
	}

	@When("User enter the email as <{string}>")
	public void user_enter_the_email_as(String string) {
       String time=TimeValueGenerator.getTime();
		r.email(time+string);
	}

	@When("User enter the phone number as <{string}>")
	public void user_enter_the_phone_number_as(String string) {
		r.phoneNumber(string);
	}

	@When("User select the engineer from occupation dropdown")
	public void user_select_the_engineer_from_occupation_dropdown() {
		r.occuption();
	}

	@When("User select the gender radio button")
	public void user_select_the_gender_radio_button() {
		r.gender();
	}

	@When("User enter the password as <{string}>")
	public void user_enter_the_password_as(String string) {
		r.password(string);
	}

	@When("User enter the confirm password as <{string}>")
	public void user_enter_the_confirm_password_as(String string) {
		r.confirmPassword(string);
	}

	@When("User click on the check box")
	public void user_click_on_the_check_box() {
		r.clickOnCheckBox();
	}

	@When("User click on the register button")
	public void user_click_on_the_register_button() {
		r.clickOnFinalRegisterButton();
	}

	@Then("User navigate to the account successful page")
	public void user_navigate_to_the_account_successful_page() {
		String successMessage = r.navigateToAccSuccefulPage();
		assertEquals(successMessage,"Account Created Successfully");
	}

	@When("User click on the login.")
	public void user_click_on_the_login() {
		r.clickOnLoginButton();
	}
}
