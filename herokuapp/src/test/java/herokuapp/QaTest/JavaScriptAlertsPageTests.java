package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuJavaScriptAlertsPage;

public class JavaScriptAlertsPageTests extends BaseTest {
	
	
	@Test
	public void acceptAlertTest() throws IOException, InterruptedException{
		
		
		HeroKuJavaScriptAlertsPage heroKuJsAlertsPage = herokuHomePage.goToJavaScriptAlertsPage();
		heroKuJsAlertsPage.clickJsAlertButton();
		heroKuJsAlertsPage.acceptAlert();
		String status = heroKuJsAlertsPage.getResultStatus();
		Assert.assertTrue(status.contentEquals("You successfully clicked an alert"));
		
	}
	
	@Test
	public void confirmAlertTest() throws IOException, InterruptedException{
		
		
		HeroKuJavaScriptAlertsPage heroKuJsAlertsPage = herokuHomePage.goToJavaScriptAlertsPage();
		heroKuJsAlertsPage.clickJsConfirmButton();
		heroKuJsAlertsPage.acceptAlert();
		String status = heroKuJsAlertsPage.getResultStatus();
		Assert.assertTrue(status.contentEquals("You clicked: Ok"));
		
	}
	
	@Test
	public void dismissAlertTest() throws IOException, InterruptedException{
		
		
		HeroKuJavaScriptAlertsPage heroKuJsAlertsPage = herokuHomePage.goToJavaScriptAlertsPage();
		heroKuJsAlertsPage.clickJsConfirmButton();
		heroKuJsAlertsPage.dismissAlert();
		String status = heroKuJsAlertsPage.getResultStatus();
		Assert.assertTrue(status.contentEquals("You clicked: Cancel"));
		
	}
	
	@Test
	public void sendTextToAlertTest() throws IOException, InterruptedException{
		
		
		HeroKuJavaScriptAlertsPage heroKuJsAlertsPage = herokuHomePage.goToJavaScriptAlertsPage();
		heroKuJsAlertsPage.clickJsPromptButton();
		heroKuJsAlertsPage.sendTextToAlert("this is test");
		heroKuJsAlertsPage.acceptAlert();
		String status = heroKuJsAlertsPage.getResultStatus();
		Assert.assertTrue(status.contentEquals("You entered: this is test"));
		
	}
	
	
	

}
