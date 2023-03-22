package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuMultipleWindowsNewPage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuMultipleWindowsNewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div[class='example']")
	WebElement newWindowTextEle;
	
	public String getPageText() {
		String text = newWindowTextEle.getText();
		return text;
	}
	
	
}
