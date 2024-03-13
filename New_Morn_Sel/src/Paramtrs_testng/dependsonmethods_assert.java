package Paramtrs_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethods_assert {
	@Test
	public void compose()
	{
		Reporter.log("messge created",true);
	}
	@Test(dependsOnMethods="compose")
	public void sentitems()
	{
		Reporter.log("msg sent",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="sentitems")
	public void trash()
	{
		Reporter.log("msg delted",true);
	}

}

