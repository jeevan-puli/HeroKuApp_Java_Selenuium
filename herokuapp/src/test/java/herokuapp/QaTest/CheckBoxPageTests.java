package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuCheckBoxPage;

public class CheckBoxPageTests extends BaseTest {
	
	
	@Test
	public void checkCheckBoxTest() throws IOException, InterruptedException{
		
		
		HeroKuCheckBoxPage heroKuCheckBoxPage = herokuHomePage.goTocheckBoxPage();
		heroKuCheckBoxPage.clickCheckBoxOne();
		Assert.assertTrue(heroKuCheckBoxPage.clickBoxOneStatus());
		
	}
	
	@Test
	public void uncheckCheckBoxTest() throws IOException, InterruptedException{
		
		HeroKuCheckBoxPage heroKuCheckBoxPage = herokuHomePage.goTocheckBoxPage();
		heroKuCheckBoxPage.clickCheckBoxOne();
		heroKuCheckBoxPage.clickCheckBoxOne();
		Assert.assertFalse(heroKuCheckBoxPage.clickBoxOneStatus());
		
	}
	
	

}
