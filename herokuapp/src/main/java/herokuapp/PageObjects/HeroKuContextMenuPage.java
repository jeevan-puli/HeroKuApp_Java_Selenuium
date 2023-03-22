package herokuapp.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuContextMenuPage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuContextMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#hot-spot")
	WebElement dottedBoxEle;
	
	
	public void rightClickOnBox() {
		
		Actions actions = new Actions(driver);
		actions.contextClick(dottedBoxEle).perform();
	}
	
	
	public String getAlertText() {
		String alert = driver.switchTo().alert().getText();
		return alert;
	}
	
	public void acceptAlert() {
		
		driver.switchTo().alert().accept();
		
	}
	
	public void killBrowser() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL+"w")).perform();
	}
	
	

}
