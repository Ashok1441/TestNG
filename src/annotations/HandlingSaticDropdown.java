package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingSaticDropdown {
	
	WebDriver driver;
	@BeforeTest
	public void browserOpen() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("https://www.hyrtutorials.com/");
	}

	@Test(priority = 1)
	public void openDropdown() {
		
		Actions ac = new Actions(driver);
		 WebElement eleAdd1 = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		 WebElement eleAdd2 = driver.findElement(By.xpath("//a[text()='Dropdowns']"));
		 
		 ac.moveToElement(eleAdd1).moveToElement(eleAdd2).click().perform();	 
		 	 
	}
	
	@Test(priority = 2)
	public void singleSelectDropdown() {
		
		WebElement ddAdd = driver.findElement(By.id("course"));
		Select sec = new Select(ddAdd);
		sec.selectByVisibleText("Java");
		
		
		
		
	}
	
		@Test(priority = 3)
		public void multiselectDropDown() {
			WebElement ddAdd1 = driver.findElement(By.id("ide"));
			Select sec1=new Select(ddAdd1);
			
			if(sec1.isMultiple()) {
				Reporter.log("Yes, It is a MultiSelect - Dropdown", true);
			}
			else {
				Reporter.log("No, It is not a MultiSelect - Dropdown", true);
			}
			
			sec1.selectByVisibleText("Eclipse");
			sec1.selectByVisibleText("Visual Studio");
			
		}
}




























