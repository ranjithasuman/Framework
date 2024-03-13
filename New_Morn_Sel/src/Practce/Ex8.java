package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.cssSelector("input[id='email']"));
		 ele.sendKeys("rg@gmail.com");

}
}
