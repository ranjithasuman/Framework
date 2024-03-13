package XpathbySibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchproductAmazon {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		ele.sendKeys("HP Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Sort By']/../../../../following-sibling::div//a/div[2]/div/div[2]"));
		ele.click();
		Thread.sleep(2000);
		
	}
		
	}



