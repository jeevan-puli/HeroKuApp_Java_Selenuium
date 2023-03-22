package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuDynamicLoadingPage {
	
	WebDriver driver;

	//constructor
	public HeroKuDynamicLoadingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//PageFactory Method.
	@FindBy(css = "a[href='/dynamic_loading/1']")
	WebElement exeOneEle;
	
	@FindBy(css = "a[href='/dynamic_loading/2']")
	WebElement exeTwoEle;
	
	public HeroKuDynamicLoadingExeOnePage goToExampleOne() {
		
		exeOneEle.click();
		HeroKuDynamicLoadingExeOnePage herokuDynLoadingPageOne = new HeroKuDynamicLoadingExeOnePage(driver);
		return herokuDynLoadingPageOne;
	}
	
	public HeroKuDynamicLoadingExeTwoPage goToExampleTwo() {
		
		exeOneEle.click();
		HeroKuDynamicLoadingExeTwoPage herokuDynLoadingPageTwo = new HeroKuDynamicLoadingExeTwoPage(driver);
		return herokuDynLoadingPageTwo;
	}

}
