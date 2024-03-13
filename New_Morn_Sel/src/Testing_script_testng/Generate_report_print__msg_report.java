package Testing_script_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Generate_report_print__msg_report {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("browser maximized",true);
		driver.get("https://www.instagram.com");
		Reporter.log("url entered",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("ranj");
		Reporter.log("usename entered",true);
		Thread.sleep(2000);
		driver.close();
	}

}
