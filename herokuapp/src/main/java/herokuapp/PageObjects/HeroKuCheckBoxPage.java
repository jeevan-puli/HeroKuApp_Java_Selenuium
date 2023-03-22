package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuCheckBoxPage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuCheckBoxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input:nth-child(1)")
	WebElement checkBoxOneEle;
	
	public void clickCheckBoxOne() {
		
		checkBoxOneEle.click();
	}
	
	public boolean clickBoxOneStatus() {
		
		boolean status = checkBoxOneEle.isSelected();
		return status;
	}
	
}
