package herokuapp.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.FileUtility;

public class HeroKuCheckFileDownloadPage extends FileUtility {
	
	WebDriver driver;
	
	//constructor
	public HeroKuCheckFileDownloadPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//xpath to get first link in the page (since it is changing ever time we open the page).
	@FindBy(xpath = "//div[@class='example']/child::a[1]")
	WebElement firstFileEle;
	
	public void downloadTextFile() {
		firstFileEle.click();
	}
	
	public boolean FileDownloadStatus() throws IOException {
		
		//get the first link file name and extension on run. 
		String fileName = firstFileEle.getText();
		System.out.println(fileName);
		String splitFileName[] = fileName.split("\\.");
		System.out.println(splitFileName[0]);
		System.out.println(splitFileName[1]);
		boolean status = isFileDownloaded(splitFileName[0],splitFileName[1],5000);
		return status;
		
	}
	
	
}
