package Paramtrs_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
	@Test
	public void compose()
	{
		Reporter.log("Ranjitha",true);
	}
	@Test(dependsOnMethods="compose")
	public void sentitems()
	{
		Reporter.log("Suman",true);
	}
	@Test(dependsOnMethods="sentitems")
	public void trash()
	{
		Reporter.log("Suman",true);
	}

}


