package Generic_FWK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_class implements FW_Constants {
	public WebDriver driver;
@BeforeMethod
public void Openapp()
{
	System.setProperty("chrome_key", "chrome_value");
	driver=new ChromeDriver();
	System.setProperty("gecko_key", "gecko_value");
	driver=new FirefoxDriver();
	
}
@AfterMethod
public void closeapp()
{
	driver.close();
}

}