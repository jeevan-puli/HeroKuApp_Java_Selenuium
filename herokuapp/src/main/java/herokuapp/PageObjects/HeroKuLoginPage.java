package herokuapp.PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuLoginPage {
	
	WebDriver driver;

	//constructor
	public HeroKuLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//PageFactory Method.
	@FindBy(id = "username")
	WebElement userNameField;
	
	@FindBy(id = "password")
	WebElement passWordField;
	
	@FindBy(css = "button[type='submit']")
	WebElement loginButton;
	
	@FindBy(id = "flash")
	WebElement statusMessage;
	
	public Properties loginCredentials() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resource//GlobalData.properties");
		prop.load(fis);

		return prop;
		
	}
	
	public void fillUserName() throws IOException {
		
		userNameField.sendKeys(loginCredentials().getProperty("userName"));
	}
	
	public void fillCorrectPassword() throws IOException {
		
		passWordField.sendKeys(loginCredentials().getProperty("correctPassword"));
	}
	
	public void fillWrongPassword() throws IOException {
		
		passWordField.sendKeys(loginCredentials().getProperty("wrontPassword"));
	}
		
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public String currentPageUrl() {
		String curl = driver.getCurrentUrl();
		return curl;
	}
	
	public String loginStatusMessage() {
		String msg = statusMessage.getText();
		return msg;
	}
	

}
