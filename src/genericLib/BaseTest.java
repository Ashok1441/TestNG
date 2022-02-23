package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts {
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable {
		
		FileLib flib = new FileLib();
		String browserName = flib.readProprertyData(PRO_PATH, "browser");
		if(browserName.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty(FRIEFOX_KEY, FRIEFOX_VALUE);
			driver=new FirefoxDriver();
		}
		else {
			Reporter.log("Give proper Browser Name", true);
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Url = flib.readProprertyData(PRO_PATH, "URL");
		driver.get(Url);		
				
	}
	

}
