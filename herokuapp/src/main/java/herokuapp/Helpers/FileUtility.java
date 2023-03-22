package herokuapp.Helpers;

import java.io.File;
import java.io.IOException;
import java.time.Instant;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class FileUtility {
	

	WebDriver driver;

	public FileUtility(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

	public boolean isFileDownloaded(String expectedFileName, String fileExtension, int timeOut) throws IOException {
		
		String folderName = System.getProperty("user.dir")+File.separator+"downloads";
		System.out.println(folderName);
		File[] listOfFiles;
		String fileName;
		boolean fileDownload = false;
		long startTime = Instant.now().toEpochMilli();
		long waitTime = startTime + timeOut;
		
		System.out.print(startTime);
		System.out.print(waitTime);
		
		
		while(Instant.now().toEpochMilli() < waitTime){
			
			//Get all the file from the download folder
			listOfFiles = new File(folderName).listFiles();
			
			for(File file:listOfFiles) {
				fileName = file.getName().toLowerCase();
				//System.out.println(fileName+"\n");
				boolean firstCondition = fileName.contains(expectedFileName.toLowerCase());
				System.out.print("C1:"+firstCondition+"\n");
				
				boolean seconCondition = fileName.contains(fileExtension.toLowerCase());
				System.out.print("C2:"+seconCondition+"\n");
				
				boolean thirdCondition = fileName.contains("crdownload");
				System.out.print("C3:"+thirdCondition+"\n");
				
				long lastmod = file.lastModified();
				boolean fourthCondition = lastmod > startTime;
				System.out.print("C4:"+fourthCondition+"\n");
				
				if(firstCondition && seconCondition && !thirdCondition && fourthCondition){
					
					fileDownload = true;
					FileUtils.cleanDirectory(new File(folderName));
					break;
				}
			}
			if(fileDownload)
				break;
		}
		return fileDownload;
	}
	
	public void uploadFile(WebElement element, String fileName) {
		
		element.sendKeys(System.getProperty("user.dir")+"/uploads/"+fileName);
	}
	
}
