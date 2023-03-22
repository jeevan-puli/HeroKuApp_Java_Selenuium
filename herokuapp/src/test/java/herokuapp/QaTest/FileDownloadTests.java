package herokuapp.QaTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import herokuapp.BaseComponents.BaseTest;
import herokuapp.PageObjects.HeroKuCheckFileDownloadPage;

public class FileDownloadTests extends BaseTest {
	
	
	@Test
	public void FileDownloadTest() throws IOException, InterruptedException {
		
		
		HeroKuCheckFileDownloadPage fileDownloadPage = herokuHomePage.goToFileDownloadPage();
		fileDownloadPage.downloadTextFile();
		Assert.assertTrue(fileDownloadPage.FileDownloadStatus());
		
	
	}
	

}
