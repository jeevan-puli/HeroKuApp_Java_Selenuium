package herokuapp.QaTest;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuDynamicContentPage;

public class DynamicContentTests extends BaseTest{
	
	
	
	@Test
	public void dynamicContentTest() throws IOException{
		
		HeroKuDynamicContentPage dynamicContentPage = herokuHomePage.goToDynamicContentPage();
		List<String> initialLaodList = dynamicContentPage.getContent();
		//System.out.print("First String:   "+initialLaodList);
		dynamicContentPage.refreshPage();
		List<String> afterRefreshList = dynamicContentPage.getContent();
		//System.out.print("Second String: "+afterRefreshList);
		boolean compareContent = initialLaodList.equals(afterRefreshList);
		Assert.assertFalse(compareContent);
		
	}
	
}