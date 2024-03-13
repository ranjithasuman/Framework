package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Desktop/xpath2.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/div/input")).sendKeys("ranjitha");
	Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/div[2]/a")).click();
		
	}
	


}
