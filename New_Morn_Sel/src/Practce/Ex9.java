package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/dummywebpage1.html");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//input[@id='i1']"));
		 ele.sendKeys("rgj");
		 Thread.sleep(2000);
		 ele.clear();
		 driver.findElement(By.xpath("//a[@class='c1']")).click();
		 
	
		 
		
	}
	
		

}

