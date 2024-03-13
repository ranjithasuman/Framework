package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
		 ele.sendKeys("rgj");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aft5@fgff");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
	
		 
		
	}
	
		


}
