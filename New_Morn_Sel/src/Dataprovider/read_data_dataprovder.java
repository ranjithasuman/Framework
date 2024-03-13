package Dataprovider;

import org.testng.annotations.DataProvider;

public class read_data_dataprovder {
	@DataProvider(name="loginCredentials")
	public Object[][] getData()
	{
		Object[][] data={{"ranj@gmail.com","123"},{"ranju@gmail.com","456"},{"ranjitha@gmail.com","678"}};
		return data;
	}
	@DataProvider(name="loginCredentials2")
	public Object[][] getData1()
	{
		Object[][] data={{"8797666666","F"},{"875443332234","F"},{"67588865448","F"}};
		return data;
	}

}
