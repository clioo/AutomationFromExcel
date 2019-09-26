package pageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenContent {
	@FindBy (xpath = "//*[@Class='rte']/p[1]")
	public WebElement womenContentSceneP1;
	
	@FindBy (xpath = "//*[@Class='rte']/p[2]")
	public WebElement womenContentSceneP2;
	
	@FindBy (xpath = "//*[@Class='rte']/p[3]")
	public WebElement womenContentSceneP3;
}
