package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/HP/Desktop/task.html");
	driver.findElement(By.className("c1")).sendKeys("XYZ");
	Thread.sleep(2000);
	driver.findElement(By.id("i1")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("i1")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.className("c1")).clear();
	
	
}
}
