package Runner_FM;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import Generic_FM.Generic_read_excel;
import Generic_FM_ANNOTATIONS.Baseclass;
import POM_FM.Login_pom;

public class Runner2_genrcreadexcel extends Baseclass {
 
		@Test
		public void login1() throws InterruptedException
		{
			Login_pom p = new Login_pom(driver);//login_pom bz pomclass name
		String un=Generic_read_excel.getdata("Sheet1", 0, 1);
			String pwd=Generic_read_excel.getdata("Sheet1", 1, 1);
			Assert.fail();
			p.passData1(un);
			Thread.sleep(2000);
			p.passData2(pwd);
			Thread.sleep(2000);
			p.enter();
			
			
		}

}
