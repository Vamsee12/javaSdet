package dataprovider;

import org.testng.annotations.Test;

public class TestClass {

	@Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderClass.class)
	public void loginTest(String email, String Pswd) {
		System.out.println(email + " " + Pswd);
	}

}
//if dataprovider method is in other class we need to provide classname.class
//need to give a name to dataprovider method
