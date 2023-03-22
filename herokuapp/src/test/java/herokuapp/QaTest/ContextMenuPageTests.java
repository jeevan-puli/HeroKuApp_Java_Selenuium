package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuContextMenuPage;

public class ContextMenuPageTests extends BaseTest {
	
	
	@Test
	public void contextMenuTest() throws IOException, InterruptedException{
		
		
		HeroKuContextMenuPage heroKuCheckBoxPage = herokuHomePage.goToContextMenuPage();
		heroKuCheckBoxPage.rightClickOnBox();
		String alert = heroKuCheckBoxPage.getAlertText();
		Assert.assertTrue(alert.contentEquals("You selected a context menu"));
		//heroKuCheckBoxPage.killBrowser();
		
	}
	
	
}
