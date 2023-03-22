package herokuapp.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroKuHomePage {

	WebDriver driver;
	public HeroKuCheckBoxPage heroKuCheckBoxPage;
	

	//constructor
	public HeroKuHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//PageFactory Method.
	@FindBy(css = "a[href='/checkboxes']")
	WebElement checkBoxEle;
	
	@FindBy(css = "a[href='/context_menu']")
	WebElement contextMenuEle;
	
	@FindBy(css = "a[href='/drag_and_drop']")
	WebElement dragAndDropEle;
	
	@FindBy(css = "a[href='/dropdown']")
	WebElement dropDownEle;
	
	@FindBy(css = "a[href='/dynamic_content']")
	WebElement dynContentEle;
	
	@FindBy(css = "a[href='/dynamic_controls']")
	WebElement dynControlsEle;
	
	@FindBy(css = "a[href='/dynamic_loading']")
	WebElement dynLoading;
	
	@FindBy(css = "a[href='/download']")
	WebElement fileDownloadEle;
	
	@FindBy(css = "a[href='/upload']")
	WebElement fileUploadEle;
	
	@FindBy(css = "a[href='/floating_menu']")
	WebElement floatingMenuEle;
	
	@FindBy(css = "a[href='/frames']")
	WebElement framesEle;
	
	@FindBy(css = "a[href='/hovers']")
	WebElement hoverEle;
	
	@FindBy(css = "a[href='/javascript_alerts']")
	WebElement javaScriptAlertEle;
	
	@FindBy(css = "a[href='/javascript_error']")
	WebElement javaScriptOnloadErrEle;
	
	@FindBy(css = "a[href='/windows']")
	WebElement multWindowEle;
	
	@FindBy(css = "a[href='/notification_message']")
	WebElement notificationMsgEle;
	
	@FindBy(css = "a[href='/login']")
	WebElement formAuthEle;
	
	
	
	public void goToBaseUrl() {
		
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	public HeroKuLoginPage goToFormAuthenticationPage() {
		
		formAuthEle.click();
		HeroKuLoginPage herokuLoginPage = new HeroKuLoginPage(driver);
		return herokuLoginPage;
	}
	
	public HeroKuCheckBoxPage goTocheckBoxPage() {
		
		checkBoxEle.click();
		HeroKuCheckBoxPage checkBoxpage = new HeroKuCheckBoxPage(driver);
		return checkBoxpage;
	}
	
	public HeroKuContextMenuPage goToContextMenuPage() {
		
		contextMenuEle.click();
		HeroKuContextMenuPage contextMenuPage = new HeroKuContextMenuPage(driver);
		return contextMenuPage;
	}
	
	public HeroKuDragAndDropPage goToDragAndDropPage() {
		
		dragAndDropEle.click();
		HeroKuDragAndDropPage dragAndDropPage = new HeroKuDragAndDropPage(driver);
		return dragAndDropPage;
	}
	
	public HeroKuDropDownPage goToDropDownPage() {
		
		dropDownEle.click();
		HeroKuDropDownPage dropDownPage = new HeroKuDropDownPage(driver);
		return dropDownPage;
	}
	
	public HeroKuDynamicContentPage goToDynamicContentPage() {
		
		dynContentEle.click();
		HeroKuDynamicContentPage dynamicContentPage = new HeroKuDynamicContentPage(driver);
		return dynamicContentPage;
	}
	
	public HeroKuDynamicControlsPage goToDynamicControlsPage() {
		
		dynControlsEle.click();
		HeroKuDynamicControlsPage dynamicControlsPage = new HeroKuDynamicControlsPage(driver);
		return dynamicControlsPage;
	}
	
	public HeroKuDynamicLoadingPage goToDynamicLoadingPage() {
		
		dynLoading.click();
		HeroKuDynamicLoadingPage dynamicLoadingPage = new HeroKuDynamicLoadingPage(driver);
		return dynamicLoadingPage;
	}
	
	public HeroKuCheckFileDownloadPage goToFileDownloadPage() {
		
		fileDownloadEle.click();
		HeroKuCheckFileDownloadPage fileDownloadPage = new HeroKuCheckFileDownloadPage(driver);
		return fileDownloadPage;
	}
	
	public HeroKuFileUploadPage goToFileUploadPage() {
		
		fileUploadEle.click();
		HeroKuFileUploadPage fileUploadPage = new HeroKuFileUploadPage(driver);
		return fileUploadPage;
	}
	
	public HeroKuFloationgMenuPage goToFlotingMenuPage() {
		
		floatingMenuEle.click();
		HeroKuFloationgMenuPage floatingMenuPage = new HeroKuFloationgMenuPage(driver);
		return floatingMenuPage;
	}
	
	public HeroKuFramesPage goToFramesPage() {
		
		framesEle.click();
		HeroKuFramesPage framesPage = new HeroKuFramesPage(driver);
		return framesPage;
	}
	
	public HeroKuMouseHoverPage goToMouseHoverPagePage() {
		
		hoverEle.click();
		HeroKuMouseHoverPage mouseHoverPage = new HeroKuMouseHoverPage(driver);
		return mouseHoverPage;
	}
	
	public HeroKuJavaScriptAlertsPage goToJavaScriptAlertsPage() {
		
		javaScriptAlertEle.click();
		HeroKuJavaScriptAlertsPage javascriptAlertsPage = new HeroKuJavaScriptAlertsPage(driver);
		return javascriptAlertsPage;
	}
	
	public HeroKuJavaScriptErrorPage goToJavaScriptErroPage() {
		
		javaScriptOnloadErrEle.click();
		HeroKuJavaScriptErrorPage javascriptErrorPage = new HeroKuJavaScriptErrorPage(driver);
		return javascriptErrorPage;
	}
	
	public HeroKuMultipleWindowsPage goToMultipleWindowPage() {
		
		multWindowEle.click();
		HeroKuMultipleWindowsPage multipleWindowPage = new HeroKuMultipleWindowsPage(driver);
		return multipleWindowPage;
	}
	
	public HeroKuNotificationMessagePage goToNotificationMsgPage() {
		
		notificationMsgEle.click();
		HeroKuNotificationMessagePage notificationMsgPage = new HeroKuNotificationMessagePage(driver);
		return notificationMsgPage;
	}


}
