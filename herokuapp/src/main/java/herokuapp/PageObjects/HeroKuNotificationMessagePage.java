package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuNotificationMessagePage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuNotificationMessagePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[href='/notification_message']")
	WebElement clickHereLinkEle;
	
	@FindBy(id = "flash")
	WebElement statusMsgEle;
	
	public void clickClickHereLink() {
		clickHereLinkEle.click();
	}
	
	public String getStatusMsg() {
		String msg = statusMsgEle.getText();
		return msg;
	}
	
}
