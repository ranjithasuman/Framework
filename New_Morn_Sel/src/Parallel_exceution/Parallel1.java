package Parallel_exceution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_endtoend.pom_ete;

public class Parallel1 {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void exec(String browser) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		else{
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			
			
			
		}
	}
	

}
