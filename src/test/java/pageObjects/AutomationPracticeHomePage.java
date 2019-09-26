package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageLocation.AutomationPracticeHomeContent;

public class AutomationPracticeHomePage {
	public WebDriver driver;
	WebDriverWait wait;
	public AutomationPracticeHomeContent automationPracticeHomeContent;
	public AutomationPracticeHomePage(WebDriver driver) {
		this.driver = driver;
		automationPracticeHomeContent = PageFactory.initElements(driver, AutomationPracticeHomeContent.class);
		wait = new WebDriverWait(this.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(automationPracticeHomeContent.signInLink));
	}
	public void clickWomenLink() {
		automationPracticeHomeContent.womenLink.click();
	}
	public void clickSignIn() {
		automationPracticeHomeContent.signInLink.click();
	}
}
