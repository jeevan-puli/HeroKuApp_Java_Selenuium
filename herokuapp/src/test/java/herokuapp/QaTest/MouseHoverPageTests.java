package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuMouseHoverPage;

public class MouseHoverPageTests extends BaseTest {
	
	
	@Test
	public void mouseHoverTest() throws IOException, InterruptedException{
		
		
		HeroKuMouseHoverPage heroKuMouseHoverPage = herokuHomePage.goToMouseHoverPagePage();
		boolean additionInfoStatus = heroKuMouseHoverPage.checkAdditionalInfoOnImages();
		Assert.assertTrue(additionInfoStatus);
		
	}
	
	
	

}
