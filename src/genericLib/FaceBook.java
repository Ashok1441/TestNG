package genericLib;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FaceBook {

	@Test
	public void faceBookSingUP() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
//	   Actions ac= new Actions(driver);
//	   
//	    ac.sendKeys(Keys.TAB)
//	   .sendKeys(Keys.TAB)
//	   .sendKeys("Ashok")
//	   .pause(Duration.ofSeconds(1))
//	   .sendKeys(Keys.TAB)
//	   .sendKeys("kumar")
//	   .pause(Duration.ofSeconds(1))
//	   .sendKeys(Keys.TAB)
//	   .sendKeys("9177203454")
//	   .pause(Duration.ofSeconds(1))
//	   .sendKeys(Keys.TAB)
//	   .sendKeys("ashok91")
//	   .pause(Duration.ofSeconds(1))
//	   .sendKeys(Keys.TAB)
//	   .sendKeys(Keys.TAB)
//	   .sendKeys(Keys.TAB)
//	   .sendKeys(Keys.TAB)
//	   .sendKeys(Keys.TAB)
//	   .sendKeys(Keys.TAB)
//	   .sendKeys(Keys.ARROW_RIGHT)
//	   .perform();
	    
	  
	    
	    
	   
	   
		
	}
}
