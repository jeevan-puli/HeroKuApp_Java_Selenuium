package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuMultipleWindowsNewPage;
import herokuapp.PageObjects.HeroKuMultipleWindowsPage;

public class MultiWindowsPageTests extends BaseTest {
	
	
	@Test
	public void multiWindowsTest() throws IOException, InterruptedException{
		
		
		HeroKuMultipleWindowsPage heroKuMultiWindowPage = herokuHomePage.goToMultipleWindowPage();
		heroKuMultiWindowPage.clickHereClick();
		heroKuMultiWindowPage.switchWindow(1);
		HeroKuMultipleWindowsNewPage heroKuMultiWindowNewPage = heroKuMultiWindowPage.goToMultipleWindowNewPage();
		String textInNewWindow = heroKuMultiWindowNewPage.getPageText();
		Assert.assertTrue(textInNewWindow.contentEquals("New Window"));
	
	}
	
}
