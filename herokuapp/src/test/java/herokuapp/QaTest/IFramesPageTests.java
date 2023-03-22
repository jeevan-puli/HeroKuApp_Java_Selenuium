package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuFramesPage;
import herokuapp.PageObjects.HeroKuIFramePage;

public class IFramesPageTests extends BaseTest {
	
	
	@Test
	public void checkCheckBoxTest() throws IOException, InterruptedException{
		
		
		HeroKuFramesPage heroKuFramePage = herokuHomePage.goToFramesPage();
		HeroKuIFramePage heroKuIframePage = heroKuFramePage.goToIFramesPage();
		heroKuIframePage.swithToIframe();
		String editorText = heroKuIframePage.getEditorContent();
		//System.out.println(editorText);
		Assert.assertTrue(editorText.contentEquals("Your content goes here."));
	}
	

}
