package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Locator {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/HP/Desktop/demo3.html");
			Thread.sleep(5000);
			driver.findElement(By.id("face")).click();
			
			
			
		}

	}


