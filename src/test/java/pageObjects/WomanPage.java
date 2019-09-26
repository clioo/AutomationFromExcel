package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocation.WomenContent;

public class WomanPage {
	private WebDriver driver;
	public WomenContent womenContent;
	public WomanPage(WebDriver webDriver) {
		driver = webDriver;
		womenContent = PageFactory.initElements(driver, WomenContent.class);
	}
	public String getSceneTextP1() {
		return womenContent.womenContentSceneP1.getText();
	}
	
	public String getSceneTextP2() {
		return womenContent.womenContentSceneP2.getText();
	}
	
	public String getSceneTextP3() {
		return womenContent.womenContentSceneP3.getText();
	}
	
	public void clickAnyLink(String linkText) {
		driver.findElement(By.xpath("//a[contains(text(),'"+linkText+"')]")).click();
	}
}
