package Annotaions_Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner4 extends Generic_scipt2{
	@Test
	public void validLogin3()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.fail();
		
	}

}
