package XpathByAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstaXpathbyAtribute {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com//");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nnnnn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kthmn@vgh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		
		
		
	}

}
