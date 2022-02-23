package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActiTime {
	
	 WebDriver driver;
	 
	@BeforeTest
	public void browserOpen() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
				
	}
	@Test(priority = 1)
	public void actiTimePage() {
		driver.get("https://demo.actitime.com/login.do");
	
	}
	
	@Test(priority = 2 , dependsOnMethods = "actiTimePage")
	public void verifyLoginPage() {
		
		String expTitle="actiTIME - Login";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expTitle);
			
	}
	
	@Test(priority = 3)
	public void logIn() throws Throwable {
		//Assert.fail();
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 4, dependsOnMethods= "logIn")
	public void verifyHomepage() {
		
		String expHometitle = "actiTIME - Enter Time-Track";
		String actHometitle = driver.getTitle();
		Assert.assertEquals(actHometitle, expHometitle);
		
		
	}
	@AfterTest
	public void closingBrowser() {
		driver.close();
	}
	
	
	
}
