package pageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignInPageContent {
	@FindBy (xpath = "//*[@id='create-account_form']/child::h3")
	public WebElement createAccountTitle;
	
	 @FindBy (id = "email_create")
	 public WebElement emailField;
	 
	 @FindBy (id = "SubmitCreate")
	 public WebElement submitBtn;

	 @FindBy (xpath = "//li[contains(text()='Invalid email address.')]")
	 public WebElement invalidEmail;
	 
	 @FindBy (xpath = "//*[contains(text(),'Welcome to your account')]")
	 public WebElement welcomeToUser;
	 
	 @FindBy (xpath = "//*[@id='customer_firstname']")
	 public WebElement firstName;
	 
	 @FindBy (xpath = "//*[@id='customer_lastname']")
	 public WebElement lastName;
	 
	 @FindBy (xpath = "//*[@id='passwd']")
	 public WebElement password;
	 
	 @FindBy (xpath = "//*[@id='address1']")
	 public WebElement address;
	 
	 @FindBy (xpath = "//*[@id='city']")
	 public WebElement city;
	 
	 @FindBy (xpath = "//*[@id='id_state']")
	 public WebElement dropDownState;
	 
	 @FindBy (xpath = "//*[@id='postcode']")
	 public WebElement postCode;
	 
	 @FindBy (xpath = "//*[@id='phone_mobile']")
	 public WebElement phone;
	 
	 @FindBy (xpath = "//*[@id='submitAccount']")
	 public WebElement submitAccount;
	 
	 
	 @FindBy (xpath = "//a[@class='logout']")
	 public WebElement logOut;
	 
	 @FindBy (xpath = "//a[@class='login']")
	 public WebElement signIn;
	 
	 @FindBy (xpath = "//*[contains(text(),'An account using this email address has already been registered. Please enter a valid password or request a new one. ')]")
	 public WebElement accountCreated;
	 
	
	
	 
	 
}
