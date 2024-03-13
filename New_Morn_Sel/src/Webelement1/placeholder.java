package Webelement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class placeholder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter your name']"));
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("placeholder is present");
		}
		else
		{
			System.out.println("placeholder is not present");
		}
	
	}
}
