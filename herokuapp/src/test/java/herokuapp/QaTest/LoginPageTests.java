package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuLoginPage;

public class LoginPageTests extends BaseTest{
	
	
	
	@Test
	public void wrongPasswordTest() throws IOException{
		
		HeroKuLoginPage herokuLoginPage = herokuHomePage.goToFormAuthenticationPage();
		herokuLoginPage.fillUserName();
		herokuLoginPage.fillWrongPassword();
		herokuLoginPage.clickLoginButton();
		String statusMsg = herokuLoginPage.loginStatusMessage(); //text in red
		Assert.assertTrue(statusMsg.contains("invalid!"));
		
	}
	
	@Test
	public void loginSuccessTest() throws IOException{
		
		HeroKuLoginPage herokuLoginPage = herokuHomePage.goToFormAuthenticationPage();
		herokuLoginPage.fillUserName();
		herokuLoginPage.fillCorrectPassword();
		herokuLoginPage.clickLoginButton();
		String currentUrl = herokuLoginPage.currentPageUrl();
		Assert.assertTrue(currentUrl.contains("secure"));
		
	}
	
}