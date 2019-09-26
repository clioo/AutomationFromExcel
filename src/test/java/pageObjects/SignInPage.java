package pageObjects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import pageLocation.SignInPageContent;
import utils.User;

public class SignInPage {
	WebDriverWait wait;
	private WebDriver driver;
	//esta se usará en caso de que ya se tenga el usuario
	private User user;
	public SignInPageContent signInPageContent;
	/*
	 * Si se inicializa de esta manera, se tendrá que ingresar uno por uno los datos del usuario
	 */
	public SignInPage(WebDriver webDriver) {
		driver = webDriver;
		signInPageContent = PageFactory.initElements(driver, SignInPageContent.class);
		wait = new WebDriverWait(this.driver, 10);
	}
	
	public Boolean verifyCreateAccountTitle() {
		String title = signInPageContent.createAccountTitle.getText();
		return title.equalsIgnoreCase("Create an account");
	}
	
	public void enterEmail(String email) {
		signInPageContent.emailField.sendKeys(email);
	}
	public void clickCreateAccountBtn() {
		signInPageContent.submitBtn.click();
		wait.until(ExpectedConditions.elementToBeClickable(signInPageContent.firstName));
	}
	
	public void enterFirstName(String value) {
		signInPageContent.firstName.sendKeys(value);
	}
	
	public void enterLastName(String value) {
		signInPageContent.lastName.sendKeys(value);
	}
	
	public void enterPassword(String value) {
		signInPageContent.password.sendKeys(value);
	}
	
	public void enterAddress(String value) {
		signInPageContent.address.sendKeys(value);
	}
	
	public void enterCity(String value) {
		signInPageContent.city.sendKeys(value);
	}
	public void enterPostalCode(String value) {
		System.out.println(value);
		value = value.substring(0,5);
		signInPageContent.postCode.sendKeys(value);
	}
	
	public void selectState(String state) {
		Select select = new Select(signInPageContent.dropDownState);
		select.selectByVisibleText(state);
	}
	
	public void enterPhone(String value) {
		signInPageContent.phone.sendKeys(value);
	}
	
	public Boolean submitAccount() {
		signInPageContent.submitAccount.click();
		wait.until(ExpectedConditions.elementToBeClickable(signInPageContent.logOut));
		 try {
			 Dimension dimensions = signInPageContent.logOut.getSize();
			 signInPageContent.logOut.click();
			 wait.until(ExpectedConditions.elementToBeClickable(signInPageContent.signIn));
			 return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public Boolean checkIfValidEmail(String email) {
		return signInPageContent.invalidEmail.getText().equalsIgnoreCase("Invalid email address.");
	}
}
