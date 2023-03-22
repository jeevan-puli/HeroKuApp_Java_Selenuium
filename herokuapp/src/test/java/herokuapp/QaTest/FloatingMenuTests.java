package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuFloationgMenuPage;

public class FloatingMenuTests extends BaseTest {
	
	
	@Test
	public void FilUploadTest() throws IOException, InterruptedException {
		
		
		HeroKuFloationgMenuPage floatingMenuPage = herokuHomePage.goToFlotingMenuPage();
		floatingMenuPage.scrollByAmount(0,400).build().perform();
		boolean status = floatingMenuPage.isMenuBarVisible();
		Assert.assertTrue(status);
		
	}
	

}
