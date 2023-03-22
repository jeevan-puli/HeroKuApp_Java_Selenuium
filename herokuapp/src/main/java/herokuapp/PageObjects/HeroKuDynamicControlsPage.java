package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.Waits;

public class HeroKuDynamicControlsPage extends Waits {
	
	WebDriver driver;
	
	//constructor
	public HeroKuDynamicControlsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css = "button[onclick='swapCheckbox()']")
	WebElement removeAddButtonEle;
	
	@FindBy(id = "loading")
	WebElement loadingAnmEle;
	
	@FindBy(id = "message")
	WebElement removeAddStatusTextEle;
	
	@FindBy(css = "input[type='text']")
	WebElement textFieldEle;
	
	@FindBy(css = "button[onclick='swapInput()']")
	WebElement enableDisableButtonEle;
	
	public void clickRemoveAddButton() {
		removeAddButtonEle.click();
		
	}
	
	public String statusMessage() {
		
		waitForWebElementToDisappear(loadingAnmEle);
		String statusMsg = removeAddStatusTextEle.getText();
		return statusMsg;
	}
	
	public void clickEnableDisableButton() {
		enableDisableButtonEle.click();
	}
	
	
}
