package Practce;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchurl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
