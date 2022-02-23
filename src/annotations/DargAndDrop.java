package annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DargAndDrop {
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void dargAndDrop() {
		

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
		// driver.close();
		
		
	}
	
	@Test(priority = 2)
	public void darggable() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(drag, 250, 200).perform();
	}
	
	@Test(priority = 3)
	public void resizable() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		WebElement resizeEle = driver.findElement(By.xpath("(//div[@style='z-index: 90;'])[3]"));
		
		Actions ac=new Actions(driver);
		 ac.clickAndHold(resizeEle).moveByOffset(150, 100).release(resizeEle).build().perform();

	}
	
}











