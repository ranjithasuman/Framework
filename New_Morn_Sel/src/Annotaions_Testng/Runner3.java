package Annotaions_Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner3 extends Generic_scipt2 {
	@Test
	public void validLogin2()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("ss"));
		System.out.println("hiii");
	}


}
