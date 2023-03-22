package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuFileUploadPage;

public class FileUploadTest extends BaseTest {
	
	
	@Test
	public void FilUploadTest() throws IOException, InterruptedException {
		
		
		HeroKuFileUploadPage fileUploadPage = herokuHomePage.goToFileUploadPage();
		fileUploadPage.upLoadFile();
		fileUploadPage.clickUploadButton();
		boolean uploadStatus = fileUploadPage.uploadStatus();
		Assert.assertTrue(uploadStatus);
		
	}
	

}
