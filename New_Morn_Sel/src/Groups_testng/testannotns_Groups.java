package Groups_testng;

import org.testng.annotations.Test;

public class testannotns_Groups {
	@Test(groups={"sanity"})
		public void test1()
		{
			System.out.println("hello India");
		}
	@Test(groups={"sanity","regression"})
	public void test2()
	{
		System.out.println("hello Asia");
	}
	@Test(groups={"regression"})
	public void test3()
	{
		System.out.println("hello world");
	}


}
