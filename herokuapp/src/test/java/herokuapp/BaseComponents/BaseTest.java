package herokuapp.BaseComponents;

import herokuapp.PageObjects.HeroKuHomePage;
import herokuapp.PageObjects.HeroKuLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class BaseTest {
	
	public WebDriver driver; 
	public HeroKuHomePage herokuHomePage;
	public HeroKuLoginPage herokuLoginPage;
	
	public WebDriver browserInvoc() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resource//GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options = new ChromeOptions();
			
			//Hasmap to disable notifications and set the browser default download location to project downloads folder.
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", System.getProperty("user.dir")+"/downloads");
			
			options.setExperimentalOption("prefs",chromePrefs);
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable notifications");
			
			DesiredCapabilities cp = new DesiredCapabilities();
			cp.setCapability(ChromeOptions.CAPABILITY, options);
			
			options.merge(cp);
			driver = new ChromeDriver(options);
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			//firefox
		} else if (browserName.equalsIgnoreCase("safari")) {
			//safari
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	@BeforeMethod
	public HeroKuHomePage openTestPage() throws IOException {
		
		driver = browserInvoc();
		herokuHomePage = new HeroKuHomePage(driver);
		herokuHomePage.goToBaseUrl();
		return herokuHomePage;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


