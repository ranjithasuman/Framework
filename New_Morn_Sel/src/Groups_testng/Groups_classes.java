package Groups_testng;

import org.testng.annotations.Test;

@Test(groups={"g1"})
public class Groups_classes {
	
		@Test(groups={"sanity"})
			public void d1()
			{
				System.out.println("hi");
			}
		@Test(groups={"sanity","regression"})
		public void d2()
		{
			System.out.println("hello");
		}
		@Test(groups={"sanity"})
		public void d3()
		{
			System.out.println("hwu");
		}


	}


