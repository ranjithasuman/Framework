package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/parent.html");
		Thread.sleep(2000);
		WebElement T1 = driver.findElement(By.id("t1"));
		T1.sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		WebElement T2 = driver.findElement(By.id("t2"));
		T2.sendKeys("xyz");
		driver.switchTo().frame("frame1");
		WebElement T3 = driver.findElement(By.xpath("//input[@id='t3']"));//we can use id or xpath
		T3.sendKeys("prq");
		Thread.sleep(2000);
		T3.clear();
		Thread.sleep(2000);
        driver.switchTo().parentFrame();
        T2.clear();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        T1.clear();
	
//		Thread.sleep(2000);	
	}
}