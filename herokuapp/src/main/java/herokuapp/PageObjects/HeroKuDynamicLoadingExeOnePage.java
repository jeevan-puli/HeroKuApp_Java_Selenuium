package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.Waits;

public class HeroKuDynamicLoadingExeOnePage extends Waits {
	
	WebDriver driver;

	//constructor
	public HeroKuDynamicLoadingExeOnePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//PageFactory Method.
	@FindBy(css = "div[id='start'] button")
	WebElement startButtonEle;
	
	@FindBy(id = "loading")
	WebElement loadingAnmEle;
	
	@FindBy(id = "finish")
	WebElement statusMessage;
	
	public void clickStartButton() {
		startButtonEle.click();
	}
	
	public String statusMessage() {
		
		waitForWebElementToDisappear(loadingAnmEle);
		String statusMsg = statusMessage.getText();
		return statusMsg;
	}
	
}
