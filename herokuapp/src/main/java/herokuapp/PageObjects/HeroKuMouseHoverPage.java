package herokuapp.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.ReguralActions;

public class HeroKuMouseHoverPage extends ReguralActions {
	
	WebDriver driver;
	
	//constructor
	public HeroKuMouseHoverPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='figure']")
	List <WebElement> imageElemArry;
	
	@FindBy(xpath = "//div[@class='figcaption']//h5")
	List <WebElement> additionalInfoElemArray;
	
	public boolean checkAdditionalInfoOnImages() {
		
		boolean omg = false;
		
		List<WebElement> imageList = imageElemArry;
		List<WebElement> additionalInfo = additionalInfoElemArray;
		
		mouseHover(imageList.get(0));
		//System.out.println("omg"+additionalInfo.get(0).getText());
		boolean isFirtImageInfoVisible = additionalInfo.get(0).isDisplayed();
		
		mouseHover(imageList.get(1));
		//System.out.println("omg"+additionalInfo.get(1).getText());
		boolean isSecondImageInfoVisible = additionalInfo.get(1).isDisplayed();
		
		mouseHover(imageList.get(2));
		//System.out.println("omg"+additionalInfo.get(2).getText());
		boolean isThirdImageInfoVisible = additionalInfo.get(2).isDisplayed();
		
		if(isFirtImageInfoVisible == isSecondImageInfoVisible == isThirdImageInfoVisible ) {
			omg = true;
		}
		return omg;
		
		
	}
	
	
}
