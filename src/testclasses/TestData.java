package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="inputs")
	public Object[][] getData(){
		return  new Object[][] {
			{"bmw","m3"},
			{"Audi", "a6"},
			{"benz", "c300"}
		};
	}
}
