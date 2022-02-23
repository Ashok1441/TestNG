package javaScriptExecutorDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoJavaScriptExecutor {
	
	
	@Test
	public void jsExe() throws Exception {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Point loc = driver.findElement(By.xpath("//li[text()='Textbox']")).getLocation();
		js.executeScript("window.scrollBy"+loc);
		
		
		js.executeScript("document.getElementById('firstName').value='Varalakshmi';");
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('lastName').value='Pasula';");
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('femalerb').checked=true;");
		Thread.sleep(1000);
		
		//js.executeScript("document.getElementById('englishchbx').checked=true;");
		WebElement checkBox = driver.findElement(By.id("englishchbx"));
		js.executeScript("arguments[0].checked=true;", checkBox);
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('hindichbx').checked=true;");
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('email').setAttribute('style', 'border:2px solid red; background:skyblue')"); 
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('password').style.border='2px solid red'");
		Thread.sleep(1000);
		
		js.executeScript("document.getElementById('registerbtn').click();");
		
		String url=  js.executeScript("return document.URL;").toString();
		Reporter.log("Page URL :"+url, true);
		
		String titleText =  js.executeScript("return document.title;").toString();
		Reporter.log("Webpage Title :"+titleText, true);	
		
		String DomainName =  js.executeScript("return document.domain;").toString();
		Reporter.log("Domain Name :"+DomainName, true);
		
		js.executeScript("alert('Compeleted JavascriptExecutor Execution');");
			
		}
}
