package Webelement1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys("ranjitha");
		Thread.sleep(5000);
		ele.sendKeys(Keys.CONTROL+ "a");
		ele.sendKeys(Keys.DELETE);
	}

}
