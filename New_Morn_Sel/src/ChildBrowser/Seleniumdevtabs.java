package ChildBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumdevtabs {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		WebElement rclck = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Actions act=new Actions(driver);
		act.contextClick(rclck).perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(3000);
			
			WebElement rclck1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
			Actions act1=new Actions(driver);
			act1.contextClick(rclck1).perform();
			Thread.sleep(3000);
			Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_T);
				r1.keyRelease(KeyEvent.VK_T);
				Thread.sleep(3000);
				
				WebElement rclck2 = driver.findElement(By.xpath("//span[text()='Projects']"));
				Actions act2=new Actions(driver);
				act1.contextClick(rclck2).perform();
				Thread.sleep(3000);
				Robot r2=new Robot();
				r2.keyPress(KeyEvent.VK_T);
					r2.keyRelease(KeyEvent.VK_T);
					Thread.sleep(3000);
					
					
			Set<String> all_id = driver.getWindowHandles();
			for(String id:all_id)
			{
			 Thread.sleep(2000);
				driver.switchTo().window(id);
			}
			
			
			
		
		
		

}
}
	
