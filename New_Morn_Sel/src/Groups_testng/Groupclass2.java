package Groups_testng;

import org.testng.annotations.Test;

public class Groupclass2 {
	@Test(groups={"g2"})
	public class Groups_classes {
		
			@Test(groups={"sanity"})
				public void c1()
				{
					System.out.println("ranjitha");
				}
			@Test(groups={"sanity","regression"})
			public void c2()
			{
				System.out.println("bhat");
			}
			
		}


}
