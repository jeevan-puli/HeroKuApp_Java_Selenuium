package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuFloationgMenuPage extends Actions {
	
	WebDriver driver;
	
	//constructor
	public HeroKuFloationgMenuPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "menu")
	WebElement menuBarEle;
	
	public boolean isMenuBarVisible() {
		boolean status = menuBarEle.isDisplayed();
		return status;
	}
	
	
}
