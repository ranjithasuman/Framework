package XpathByAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchingproductAmazon {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PUMA']")).click();

		
		
		
		

		
	}


}
