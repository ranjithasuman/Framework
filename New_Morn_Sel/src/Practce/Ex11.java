package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")).click();
	}
		
	
	
}
