package Annotaions_Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner2 extends Generic_scipt2 {
	@Test
	public void validLogin1()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		System.out.println("hiii");
	}

}
