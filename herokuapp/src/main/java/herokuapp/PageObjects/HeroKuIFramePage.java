package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuIFramePage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuIFramePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "mce_0_ifr")
	WebElement iframeEle;
	
	@FindBy(id = "tinymce")
	WebElement iframeContentEle;
	
	public void swithToIframe() {
		
		driver.switchTo().frame(iframeEle);
	}
	
	public String getEditorContent() {
		String text = iframeContentEle.getText();
		return text;
	}
	
}
