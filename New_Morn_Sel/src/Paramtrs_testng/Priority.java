package Paramtrs_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
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
