package Paramtrs_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void test1()
	{
		Reporter.log("Ranjitha",true);
	}
	@Test(enabled=false)
	public void test2()
	{
		Reporter.log("Suman",true);
	}

}

