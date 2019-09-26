package tests;

import java.util.concurrent.TimeUnit;

import org.softtek.config.Setup;

import junit.framework.Assert;
import pageObjects.AutomationPracticeHomePage;
import pageObjects.SignInPage;
import pageObjects.WomanPage;
import utils.ExcelUtils;
import utils.User;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationPracticeHomeActions extends Setup {
	Object[][] testObjArray;
	String testCaseWorkBook = System.getProperty("user.dir") + "/resources/FlightRegisterData2.xlsx";
	
	
	@BeforeTest
	public void setUp(){
		setBrowser();
	}
	
	@Test(dataProvider = "UserRegistration", description="Test Case for Register an user")
	public void registerUserInformation(String ... registerInfo) throws InterruptedException{
		//public void registerUserInformation(String firstName, lastName, phone, email, password, address
		//city, state, postalCode, country, userName
		User user = new User(registerInfo);
		AutomationPracticeHomePage automationPracticeHomePage =  new AutomationPracticeHomePage(driver);
		automationPracticeHomePage.clickSignIn();
		SignInPage signInPage = new SignInPage(driver);
		signInPage.enterEmail(user.getEmail());
		signInPage.clickCreateAccountBtn();
		signInPage.enterFirstName(user.getFirstName());
		signInPage.enterLastName(user.getLastName());
		signInPage.enterPhone(user.getPhone());
		signInPage.enterPassword(user.getPassword());
		signInPage.enterAddress(user.getAddress());
		signInPage.enterCity(user.getCity());
		signInPage.selectState(user.getState());
		signInPage.enterPostalCode(user.getPostalCode());
		Assert.assertTrue(signInPage.submitAccount());


	}
	
	@DataProvider(name = "UserRegistration")
	public Object[][] userRegister() throws Exception{
		testObjArray = ExcelUtils.getTableArray(testCaseWorkBook, "users");
		return (testObjArray);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
