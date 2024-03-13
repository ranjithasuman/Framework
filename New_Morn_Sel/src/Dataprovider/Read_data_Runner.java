package Dataprovider;

import org.testng.annotations.Test;

public class Read_data_Runner {
	@Test(dataProvider="loginCredentials",dataProviderClass=read_data_dataprovder.class)
	public void loginTest(String un,String pwd)
	{
		System.out.println(un+" "+pwd);
		
	}
	@Test(dataProvider="loginCredentials2",dataProviderClass=read_data_dataprovder.class)
	public void loginTest1(String mob,String gender)
	{
		System.out.println(mob+" "+gender);
		
	}

}
