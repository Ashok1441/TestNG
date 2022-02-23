package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	
	@BeforeSuite
	public void test1() {
		Reporter.log("BeforeSuite", true);
		
	}
	
    @BeforeTest
	public void test2() {
    	Reporter.log("BeforeTest", true);
		
	}
    
    @BeforeClass
	public void test3() {
    	Reporter.log("BeforeClass", true);
	}

    @BeforeMethod
	public void test4() {
    	Reporter.log("BeforeMethod", true);
	}

    @Test
	public void test01() {
    	Reporter.log("test1", true);
	}
	
    @AfterMethod
	public void test6() {
    	Reporter.log("AfterMethod", true);
	}	

    @AfterClass
	public void test7() {
    	Reporter.log("AfterClass", true);
	}

    @AfterTest
	public void test8() {
    	Reporter.log("AfterTest", true);
	}
  
    
    @AfterSuite
    public void test9() {
    	Reporter.log("AfterSuite", true);
    	
	}
    
    @Test
    public void test02() {
    	Reporter.log("test2", true);
    }

}
