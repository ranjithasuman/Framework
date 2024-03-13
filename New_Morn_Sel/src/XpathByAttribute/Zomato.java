package XpathByAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.zomato.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='sc-gCKARq difutf']")).sendKeys("ironhill");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[text()='Ironhill Bengaluru']")).click();
	Thread.sleep(2000);
	
	
	

	
}

}


