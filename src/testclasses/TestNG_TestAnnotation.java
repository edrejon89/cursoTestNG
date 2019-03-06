package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {
	// TestNG runs it's test order by the test method name
	@Test
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		System.out.println("Running Test -> testMEthod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMEthod2");
	}

	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMEthod3");
	}

}
