package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuDynamicControlsPage;

public class DynamicControlsPageTests extends BaseTest {
	
	
	@Test
	public void dynamicControlsRemoveAddTest() throws IOException, InterruptedException{
		
		
		HeroKuDynamicControlsPage heroKuDynamicControlsPage = herokuHomePage.goToDynamicControlsPage();
		heroKuDynamicControlsPage.clickRemoveAddButton();
		String removeStatusMsg = heroKuDynamicControlsPage.statusMessage();
		Assert.assertTrue(removeStatusMsg.contentEquals("It's gone!"));
		
		heroKuDynamicControlsPage.clickRemoveAddButton();
		String addStatusMsg = heroKuDynamicControlsPage.statusMessage();
		Assert.assertTrue(addStatusMsg.contentEquals("It's back!"));
		
		
	}
	
	@Test
	public void dynamicControlsEnableDisableTest() throws IOException, InterruptedException{
		
		
		HeroKuDynamicControlsPage heroKuDynamicControlsPage = herokuHomePage.goToDynamicControlsPage();
		heroKuDynamicControlsPage.clickEnableDisableButton();
		String enableStatusMsg = heroKuDynamicControlsPage.statusMessage();
		Assert.assertTrue(enableStatusMsg.contentEquals("It's enabled!"));
		
		heroKuDynamicControlsPage.clickEnableDisableButton();
		String disableStatusMsg = heroKuDynamicControlsPage.statusMessage();
		Assert.assertTrue(disableStatusMsg.contentEquals("It's disabled!"));
		
	}
	
	

}
