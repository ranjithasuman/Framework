package Practce;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String ttl = driver.getTitle();
		System.out.println(ttl);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String psrc = driver.getPageSource();
		System.out.println(psrc);
	}

}
