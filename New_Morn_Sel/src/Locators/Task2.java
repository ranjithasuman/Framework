package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/HP/Desktop/task2.html");
		driver.findElement(By.tagName("input")).click();
		
		driver.findElement(By.id("i1")).click();
		
	
		
}
}

