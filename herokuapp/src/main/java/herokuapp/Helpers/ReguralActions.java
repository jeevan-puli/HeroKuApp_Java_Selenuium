package herokuapp.Helpers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;

public class ReguralActions {
	

	WebDriver driver;

	public ReguralActions(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

	public void mouseHover(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void sendTextToAlert(String xyz){
		driver.switchTo().alert().sendKeys(xyz);
	}
	
	public String getTextInAlert() {
		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}
	
	public boolean checkIfJsErroLogContain(String text) {
		
		boolean zyx = false;
		LogEntries javaScriptError = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> browserLogList = javaScriptError.getAll();
		
		for(LogEntry logList : browserLogList ) {
			if(logList.toString().contains(text)) {
				zyx = true;
			}
		}
		return zyx;
		
	}
	
	public void switchWindow(int i) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(i));
	}


}
