package pageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeHomeContent {
	@FindBy (xpath = "//a[contains(text(), 'Women')]")
	public WebElement womenLink;
	
	@FindBy (xpath = "//a[@href='http://automationpractice.com/index.php?controller=my-account' and @class='login']")
	public WebElement signInLink;
}
