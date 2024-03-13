package Paramtrs_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Priority_para {
	@Test(enabled=false)//if enabled is false this will be skipped only below exects but in output only passes 1 will be there skipped will be zero
	public void login1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	
	
	
	}
	@Test
	public void login() throws InterruptedException//here just login method so first this will execute then above one ie login1(alphabeticl)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("ranjitha");
		Thread.sleep(5000);
		driver.close();
		
	

	}

}
