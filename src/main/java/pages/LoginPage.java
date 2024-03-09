package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;
WebDriverWait wait;

@FindBy(css = "input#userEmail")
WebElement userEmail;
@FindBy(css = "input#userPassword")
WebElement userPassword;
@FindBy(css = "input#login")
WebElement loginButton;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}

public void enterEmail(String email) {
	userEmail.sendKeys(email);
}
public void enterPass(String pass) {
	userPassword.sendKeys(pass);
}
public void clickOnLoginButton() {
	loginButton.click();
}
public String ValidateTitle() {
	wait.until(ExpectedConditions.titleContains("Let's Shop"));
	String title=driver.getTitle();
	return title;
}


}
