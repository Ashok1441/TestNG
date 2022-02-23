package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Edge {
	@Test
	public void edge() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium\\TestNGProject\\Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		
		Point locAdd = driver.findElement(By.xpath("//a[text()='Dynamic Content']")).getLocation();
		System.out.println(locAdd);
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+locAdd);
		driver.findElement(By.xpath("//a[text()='File Upload']")).click();
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Downloads\\certificate.pdf");
		driver.findElement(By.id("file-submit")).click();
		String text = driver.findElement(By.tagName("h3")).getText();
		Reporter.log(text, true);

		
	}

}
