package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "LoginDataProvider")
	public Object[][] getData() {

		Object[][] data = { { "abc@gmail.com", "abc" }, { "xyz@gmail.com", "xyz" }, { "pqr@gmail.com", "pqr" } };
		return data;
	}

}
