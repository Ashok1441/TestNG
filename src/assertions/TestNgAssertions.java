package assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssertions {
	
	@Test
	public void assertions() throws Throwable {  //assert class (Hard assert)  and soft assert(verify assert)
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("@shok", Keys.ENTER);
		Thread.sleep(3000);
		
		SoftAssert sa=new  SoftAssert();
		
		//title Assertions
		String actualTitle=driver.getTitle();
		String expectedTitle="Log in to Facebook";
		sa.assertEquals(actualTitle, expectedTitle, "Title is Mismated");
		
		//url Assertion
		String actulUrl=driver.getCurrentUrl();
		String expectedURL="https://www.facebook.com/";
		sa.assertNotEquals(actulUrl, expectedURL, "URL is Mismatched");
		
		//Text Assertion
		String actulText=driver.findElement(By.id("email")).getAttribute("value");
		String expectedText="";
		sa.assertEquals(actulText, expectedText, "Text is Mismatched");
		
		//broder Assertion
		String actulBroder=driver.findElement(By.id("email")).getCssValue("border");
		String expectedBroder="1px solid rgb(240, 40, 73)";
		sa.assertEquals(actulText, expectedText, "Text is Mismatched");
		
		//Error Message Assertion
		String actulErrorMsg=driver.findElement(By.id("email")).getCssValue("border");
		String expectedErrorMsg="1px solid rgb(240, 40, 73)";
		sa.assertEquals(actulText, expectedText, "Broder colour is Mismatched");
		driver.close();
		sa.assertAll();
		
	}

}
