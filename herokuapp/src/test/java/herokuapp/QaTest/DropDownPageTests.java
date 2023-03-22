package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuDropDownPage;

public class DropDownPageTests extends BaseTest{
	
	
	
	@Test
	public void dropDownTests() throws IOException, InterruptedException{
		
		HeroKuDropDownPage heroKuDropDownPage = herokuHomePage.goToDropDownPage();
		heroKuDropDownPage.selectDropDownOptionOne();
		Assert.assertTrue(heroKuDropDownPage.getSelectionText().contentEquals("Option 1"));
		heroKuDropDownPage.selectDropDownOptionTwo();
		Assert.assertTrue(heroKuDropDownPage.getSelectionText().contentEquals("Option 2"));
		
		
	}
	
}