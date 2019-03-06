package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNG_TestParameters {

	@BeforeClass
	@Parameters({"browser","platform"})
	public void setUp(String browser, String plarform) {
		System.out.println("TestNG_TestParameters -> Setup");
		System.out.println("1. Parameter value from xml file: " + browser);
		System.out.println("2. Parameter value from xml file: " + plarform);

	}

	@Test
	@Parameters({"response"})
	public void testMethod1(String response) throws InterruptedException {
		String [] stringArray = response.split(","); 
		System.out.println("TestNG_TestParameters -> testMethod1");
		System.out.println("Response from xml file: " + response );
		System.out.println("stringArray[0] from xml file: " + stringArray[0]);
		System.out.println("stringArray[1] from xml file: " + stringArray[1]);
	}
}
