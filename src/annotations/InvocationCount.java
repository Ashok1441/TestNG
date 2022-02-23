package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void test() {
		Reporter.log("It will Run through @Test Annotations", true);
	}

}
