package XpathByContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.yahoo.com/d/folders/1");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("krish1396@yahoo.com ");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("InchuRamJay13#");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@role='button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("inchu92@yahoo.com ");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='hiiii']"));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Send']"));
	Thread.sleep(2000);
	
	
	
	
	
	
}
}
