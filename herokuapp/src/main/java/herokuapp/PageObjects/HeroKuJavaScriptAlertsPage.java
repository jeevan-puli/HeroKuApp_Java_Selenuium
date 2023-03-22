package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.ReguralActions;

public class HeroKuJavaScriptAlertsPage extends ReguralActions {
	
	WebDriver driver;
	
	//constructor
	public HeroKuJavaScriptAlertsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[onclick='jsAlert()']")
	WebElement clickJsAlertButtonEle;
	
	@FindBy(css = "button[onclick='jsConfirm()']")
	WebElement clickJsConfirmButtonEle;
	
	@FindBy(css = "button[onclick='jsPrompt()']")
	WebElement clickJsPromptButtonEle;
	
	@FindBy(id = "result")
	WebElement statusMessageEle;

	public void clickJsAlertButton() {
		clickJsAlertButtonEle.click();
	}
	
	public void clickJsConfirmButton() {
		clickJsConfirmButtonEle.click();
	}
	
	public void clickJsPromptButton() {
		clickJsPromptButtonEle.click();
	}
	
	public String getResultStatus() {
		String status = statusMessageEle.getText();
		return status;
	}
	
}
