package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/Desktop%20from%20desk/parent(task2).html");
		Thread.sleep(2000);
		WebElement T1 = driver.findElement(By.id("t1"));
		T1.sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement T2 = driver.findElement(By.xpath("//input[@id='i2']"));
		T2.sendKeys("xyz");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		T1.clear();
		Thread.sleep(2000);
		driver.switchTo().frame("frame2(task2)");
		WebElement T3 = driver.findElement(By.xpath("//input[@id='i3']"));
		T3.sendKeys("yfg");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		T1.sendKeys("abc");	
		

		
		
		

		

}
}
