package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorInsta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("abc");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("xys65356");//min 6 characters
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	}
	

}
