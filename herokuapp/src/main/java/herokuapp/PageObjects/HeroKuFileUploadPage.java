package herokuapp.PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import herokuapp.Helpers.FileUtility;

public class HeroKuFileUploadPage extends FileUtility {
	
	WebDriver driver;
	
	//constructor
	public HeroKuFileUploadPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "file-upload")
	WebElement choosFileButtonEle;
	
	@FindBy(id = "file-submit")
	WebElement uploadButtonEle;
	
	@FindBy(css = "div[class='example'] h3")
	WebElement statusMessageEle;
	
	@FindBy(id = "uploaded-files")
	WebElement uploadedFileNameEle;
	
	
	public String getUploadFileName() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resource//GlobalData.properties");
		prop.load(fis);
		String uploadFile = prop.getProperty("uploadFileName");
		return uploadFile;
	}
	
	public void upLoadFile() throws IOException {
		
		String fileName = getUploadFileName();
		uploadFile(choosFileButtonEle, fileName);
		
	}
	
	public void clickUploadButton() {
		uploadButtonEle.click();
	}
	
	public boolean uploadStatus() throws IOException {
		
		String statusMessage = statusMessageEle.getText();
		String uploadedFileNameActual = uploadedFileNameEle.getText();
		String uploadedFileNameExpected = getUploadFileName();
		
		if((statusMessage.equalsIgnoreCase("File Uploaded!")) && (uploadedFileNameActual.equals(uploadedFileNameExpected))) {
			boolean status = true;	
			return status;
		} else {
			boolean status = false;
			return status;
		}
		
	}
	
	
}
