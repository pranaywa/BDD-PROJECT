package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;
	WebDriverWait w;

@FindBy(xpath = "//*[@class='login-title']")
WebElement registerTitle;
@FindBy(xpath = "//*[text()='Register']")
WebElement registerButton;
@FindBy(xpath = "//*[@id='firstName']")
WebElement firstName;
@FindBy(css = "input#lastName")
WebElement lastName;
@FindBy(css = "input#userEmail")
WebElement useremail;
@FindBy(css = "input#userMobile")
WebElement mobile;
@FindBy(xpath = "//*[@formcontrolname='occupation']")
WebElement occuptionDD;
@FindBy(xpath = "//*[@value='Male']")
WebElement male;
@FindBy(css = "input#userPassword")
WebElement password;
@FindBy(css = "input#confirmPassword")
WebElement confirmPassword;
@FindBy(xpath = "//*[@type='checkbox']")
WebElement checkBox;
@FindBy(xpath = "//*[@type='submit']")
WebElement finalRegisterButton;
@FindBy(xpath = "//*[text()='Account Created Successfully']")
WebElement accSuccessMessage;
@FindBy(xpath = "//*[text()='Login']")
WebElement loginButton;

public RegisterPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	w = new WebDriverWait(driver,Duration.ofSeconds(60));
}
public void clickOnRegisterButton() {
	registerButton.click();
}
public String validateTitleOfRegisterPage() {
	String title = driver.getTitle();
	return title;
}
public void firstname(String firstname) {
	firstName.sendKeys(firstname);
}
public void lastname(String lastname) {
	lastName.sendKeys(lastname);
}
public void email(String email) {
    useremail.sendKeys(email);	
}
public void phoneNumber(String mobileno) {
	mobile.sendKeys(mobileno);
}
public void occuption() {
	Select sel = new Select(occuptionDD);
	sel.selectByVisibleText("Engineer");
}
public void gender() {
	male.click();
}
public void password(String pass) {
	password.sendKeys(pass);
}
public void confirmPassword(String conpass) {
	confirmPassword.sendKeys(conpass);
}
public void clickOnCheckBox() {
	checkBox.click();
}
public void clickOnFinalRegisterButton() {
	finalRegisterButton.click();
}
public String navigateToAccSuccefulPage() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    String succMessage=accSuccessMessage.getText();
    return succMessage;
}
public void clickOnLoginButton() {
	loginButton.click();
}









}
