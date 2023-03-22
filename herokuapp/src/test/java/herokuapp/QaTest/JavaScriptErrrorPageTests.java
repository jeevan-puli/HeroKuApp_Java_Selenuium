package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuJavaScriptErrorPage;

public class JavaScriptErrrorPageTests extends BaseTest {
	
	
	@Test
	public void javaScriptErrorTest() throws IOException, InterruptedException{
		
		
		HeroKuJavaScriptErrorPage heroKuJavaScriptErrorPage = herokuHomePage.goToJavaScriptErroPage();
		boolean errorStatus = heroKuJavaScriptErrorPage.checkIfJsErroLogContain("Cannot read properties of undefined");
		Assert.assertTrue(errorStatus);
		
	}
	
}
