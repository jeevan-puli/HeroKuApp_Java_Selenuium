package herokuapp.PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuDynamicContentPage {
	
	WebDriver driver;
	
	//constructor
	public HeroKuDynamicContentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='large-10 columns']")
	List <WebElement> contentTextEleArry;
	
	public List<String> getContent() {
		
		List<String> textList = new ArrayList<String>();
		List<WebElement> contentTextList = contentTextEleArry;
		for(WebElement element: contentTextList) {
			textList.add(element.getText());
		}
		return textList;
		
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
}
