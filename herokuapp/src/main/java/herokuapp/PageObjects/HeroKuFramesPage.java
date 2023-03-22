package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuFramesPage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuFramesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[href='/iframe']")
	WebElement iframeLinkEle;
	
	public HeroKuIFramePage goToIFramesPage() {
		
		iframeLinkEle.click();
		HeroKuIFramePage iFramePage = new HeroKuIFramePage(driver);
		return iFramePage;
	}
	
}
