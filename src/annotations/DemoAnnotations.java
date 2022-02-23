package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {
	
	@BeforeSuite
	public void test1() {
		System.out.println("BeforeSuite is Printed");
	}
	
	@BeforeTest
	public void test2() {
		System.out.println("BeforeTest is Printed");
	}
	
	@BeforeClass
	public void test3() {
		System.out.println("BeforeClass is Printed");
		
	}
	
	@BeforeMethod
	public void test4() {
		System.out.println("BeforeMethod is Printed");
		
	}
	
	@Test
	public void test5() {
		System.out.println("Test Method is Printed");
		
	}
	
	@AfterSuite
	public void test6() {
		System.out.println("AfterSuite is Printed");
	}
	
	@AfterTest
	public void test7() {
		System.out.println("AfterTest is Printed");
	}
	
	@AfterClass
	public void test8() {
		System.out.println("AfterClass is Printed");
		
	}
	
	@AfterMethod
	public void test9() {
		System.out.println("AfterMethod is Printed");
		
	}
	

}
