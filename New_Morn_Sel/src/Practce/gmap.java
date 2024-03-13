package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/maps/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../../button")).sendKeys("bengaluru");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../../button")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../../button")).sendKeys("shimoga");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../../button")).click();
	}
		
	

}
