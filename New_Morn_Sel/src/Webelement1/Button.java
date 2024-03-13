package Webelement1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/ui/button']")).click();
		WebElement ele = driver.findElement(By.xpath("//button[@id='btn' and text()='Yes']"));
		boolean b = ele.isSelected();
		if(b)
		{
			System.out.println("button is clicked");
		}
		else
		{
			System.out.println("button is not clicked");
		}


}
}
