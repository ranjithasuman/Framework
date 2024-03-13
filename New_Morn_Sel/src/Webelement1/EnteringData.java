package Webelement1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Ranjitha");
		driver.findElement(By.id("email")).sendKeys("ranjitha.0713gm@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ranjitha@1396");
	}

}
