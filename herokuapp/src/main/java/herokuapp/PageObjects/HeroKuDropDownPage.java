package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeroKuDropDownPage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuDropDownPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "dropdown")
	WebElement dropDownEle;
	
	public String getSelectionText() {
		
		Select select = new Select(dropDownEle);
		String text = select.getFirstSelectedOption().getText();
		return text;
	}
	
	public void selectDropDownOptionOne() {
		
		Select select = new Select(dropDownEle);
		select.selectByVisibleText("Option 1");
	}
	
	public void selectDropDownOptionTwo() {
		
		Select select = new Select(dropDownEle);
		select.selectByVisibleText("Option 2");
	}
	
}
