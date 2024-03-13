package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
	}

}
