package XpathByContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstaRequest {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com//");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sumandhanya478@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shamala@1967");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//span[text()='Search'])")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ranjitha");
		//Thread.sleep(2000);
		/*driver.findElement(By.xpath("(//span[contains(.,'__r_j_a')])[1]/../../../..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);*/
		
		
	
	}
}
