package herokuapp.PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.Waits;

public class HeroKuDragAndDropPage extends Waits {
	
	WebDriver driver;
	
	//constructor
	public HeroKuDragAndDropPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='column-a']")
	WebElement columAEle;
	
	@FindBy(xpath = "//div[@id='column-b']")
	WebElement columBEle;
	
	public void dragAndDropBtoA() {
		
		Actions act = new Actions(driver);
		act.dragAndDrop(columBEle, columAEle).build().perform();
		
	}
	
	public String getFirstColumnText() {
		
		String text = columAEle.getText();
		return text;
	}
	
}
