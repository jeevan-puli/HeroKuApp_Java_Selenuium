package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuDynamicLoadingExeOnePage;
import herokuapp.PageObjects.HeroKuDynamicLoadingExeTwoPage;
import herokuapp.PageObjects.HeroKuDynamicLoadingPage;

public class DynamicLoadingTests extends BaseTest {
	
	
	@Test
	public void dynamicLoadingExeOneTest() throws IOException, InterruptedException{
		
		
		HeroKuDynamicLoadingPage heroKuDynamicLoadingPage = herokuHomePage.goToDynamicLoadingPage();
		HeroKuDynamicLoadingExeOnePage dynamicLoadExeOnePage = heroKuDynamicLoadingPage.goToExampleOne();
		dynamicLoadExeOnePage.clickStartButton();
		String statusMessage = dynamicLoadExeOnePage.statusMessage();
		Assert.assertTrue(statusMessage.contentEquals("Hello World!"));
	
	}
	
	@Test
	public void dynamicLoadingExeTwoTest() throws IOException, InterruptedException{
		
		
		HeroKuDynamicLoadingPage heroKuDynamicLoadingPage = herokuHomePage.goToDynamicLoadingPage();
		HeroKuDynamicLoadingExeTwoPage dynamicLoadExeTwoPage = heroKuDynamicLoadingPage.goToExampleTwo();
		dynamicLoadExeTwoPage.clickStartButton();
		String statusMessage = dynamicLoadExeTwoPage.statusMessage();
		Assert.assertTrue(statusMessage.contentEquals("Hello World!"));
	
	}

}
