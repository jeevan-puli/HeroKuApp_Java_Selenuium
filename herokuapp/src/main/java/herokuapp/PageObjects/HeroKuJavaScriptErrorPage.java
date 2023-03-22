package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.ReguralActions;

public class HeroKuJavaScriptErrorPage extends ReguralActions {
	
	WebDriver driver;
	
	//constructor
	public HeroKuJavaScriptErrorPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
