package Generic_FM_ANNOTATIONS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Generic_FM.Generic_ss;

public class Baseclass implements FW_constants {
	public WebDriver driver;
	@BeforeMethod
	public void Openapp()
	{
		System.setProperty(gecko_key, gecko_value);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("Fetchproperties.getProperty() ");//fetchprop is method from util
		
	}
	@AfterMethod
	public void closeapp(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Generic_ss.get_photo(driver);//class genrcss and methd getphoto driver is webriverdrvr insdeparnths there
		}
		driver.close();
	}

	}

