package Paramtrs_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
	@Test(invocationCount=2)
	public void test1()
	{
		Reporter.log("Ranjitha",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Suman",true);
	}

}

