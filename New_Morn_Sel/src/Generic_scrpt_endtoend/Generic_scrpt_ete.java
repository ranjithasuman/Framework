package Generic_scrpt_endtoend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_scrpt_ete {
	public WebDriver driver;
	@BeforeMethod
	public void openappltion()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	}
	@AfterMethod
	public void closeapplication()
	{
		driver.close();
	}

}
