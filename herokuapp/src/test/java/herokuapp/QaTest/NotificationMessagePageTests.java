package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuNotificationMessagePage;

public class NotificationMessagePageTests extends BaseTest {
	
	
	@Test
	public void actionSuccessfulTest() throws IOException, InterruptedException{
		
		
		HeroKuNotificationMessagePage heroKuNotificationMsgPage = herokuHomePage.goToNotificationMsgPage();
		
		boolean stg = false ;
		long startTime = System.currentTimeMillis();
		while((stg != true) && (System.currentTimeMillis()-startTime)<5000) {
			
			heroKuNotificationMsgPage.clickClickHereLink();
			String msg = heroKuNotificationMsgPage.getStatusMsg();
			stg = msg.contains("Action successful");
		}
		Assert.assertTrue(stg);
		
	}
	
	@Test
	public void actionUnSuccessfulTest() throws IOException, InterruptedException{
		
		
		HeroKuNotificationMessagePage heroKuNotificationMsgPage = herokuHomePage.goToNotificationMsgPage();
		
		boolean stg = false ;
		long startTime = System.currentTimeMillis();
		while((stg != true) && (System.currentTimeMillis()-startTime)<5000) {
			
			heroKuNotificationMsgPage.clickClickHereLink();
			String msg = heroKuNotificationMsgPage.getStatusMsg();
			stg = msg.contains("Action unsuccesful, please try again");
		}
		Assert.assertTrue(stg);
		
	}
	
	
	
	

}
