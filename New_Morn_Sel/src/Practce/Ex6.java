package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/dummywebpage1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("ranj");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("i1"));
		ele.clear();
		ele.sendKeys("inchu");
		Thread.sleep(2000);
		
	
	
	

}
}


