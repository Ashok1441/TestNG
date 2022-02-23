package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void test1() {
		Reporter.log("test01", true);
	}
	@Test
	public void test2() {
		Reporter.log("test02", true);
	}
	@Test
	public void ashok() {
		Reporter.log("Ashok", true);
	}
	@Test
	public void test3() {
		Reporter.log("test03", true);
	}
	@Test
	public void test() {
		Reporter.log("test04", true);
	}
}
