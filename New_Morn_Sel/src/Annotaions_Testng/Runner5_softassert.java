package Annotaions_Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Runner5_softassert extends Generic_scipt2 {
	@Test
	public void validlogin()
	{
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "face");
		System.out.println("hi");
		sa.assertAll();
	}

}
