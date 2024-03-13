package XpathbySibling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YoutubeLikebutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	/*driver.findElement(By.xpath("//span[text()='Sign in']/../..")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("ranjitha.0713gm@gmail.com");
	Thread.sleep(2000) ;
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ranjitha.0713gm@gmail.com");
	Thread.sleep(2000) ; */
	
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sapta sagaradaache yello");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();

driver.findElement(By.xpath("(//div[text()='Share'])[3]/../../../..//button[@title='I like this']")).click();

//(//div[text()='Share'])[3]/../../../..//button[@title="I like this"]


	}

}
