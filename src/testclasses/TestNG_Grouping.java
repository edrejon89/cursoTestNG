package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Grouping {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@Test(groups= {"cars", "suv"})
	public void testBMWX6() {
		System.out.println("Running test - BMW X6");
	}
	
	@Test(groups= {"cars", "sedan"})
	public void testAudiA6() {
		System.out.println("Running test - Auidi A6");
	}
	
	@Test(groups= {"bikes"})
	public void testNinja() {
		System.out.println("Running test - Kawasaki Ninja");
	}
	
	@Test(groups= {"bikes"})
	public void testHondaCBR() {
		System.out.println("Running test - Honda CBR");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");

	}

}
