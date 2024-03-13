package Practce;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/dummywebpage1.html");
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("face")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='c1']")).click();

	
	
	

}
}
