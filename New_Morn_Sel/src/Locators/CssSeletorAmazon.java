package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSeletorAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("boat");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class='s-suggestion s-suggestion-ellipsis-direction']")).click();
	Thread.sleep(2000);
driver.findElement(By.cssSelector("span[class='a-truncate-cut']")).click();
	
	}
	

}


