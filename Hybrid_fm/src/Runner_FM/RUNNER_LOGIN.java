package Runner_FM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_FM.Generic_read_excel;
import Generic_FM_ANNOTATIONS.Baseclass;
import Generic_FM_ANNOTATIONS.Baseclass;
import POM_FM.Login_pom;


public class RUNNER_LOGIN extends Baseclass {
	@Test(dataProvider="test1")
	public void login(String un,String pwd) throws InterruptedException
	{
		Login_pom p = new Login_pom(driver);//login_pom bz pomclass name
		//p.passData1(Generic_read_excel.getdata("Sheet1", 0, 1));//fr genrc excel
		//p.passData2(Generic_read_excel.getdata("Sheet1", 1, 1));
		
		p.passData1(un);
		Thread.sleep(2000);
		p.passData2(pwd);
		Thread.sleep(2000);
		p.enter();
	}
	@DataProvider(name="test1")
	public Object[][] createData1(){
		return new Object[][]{
			{"ranj","qrr44"},{"ranju","u77y"}
			
		};
	}

}
