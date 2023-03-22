package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.ReguralActions;

public class HeroKuMultipleWindowsPage extends ReguralActions {
	
	WebDriver driver;
	
	//constructor
	public HeroKuMultipleWindowsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[href='/windows/new']")
	WebElement clickHerLinkEle;
	
	public void clickHereClick() {
		
		clickHerLinkEle.click();
	}
	
	public HeroKuMultipleWindowsNewPage goToMultipleWindowNewPage() {
	
		HeroKuMultipleWindowsNewPage multipleWindowNewPage = new HeroKuMultipleWindowsNewPage(driver);
		return multipleWindowNewPage;
	} 
	
}
