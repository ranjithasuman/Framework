package XpathByContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlemap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.co.in/maps");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
	//driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../button")).click();
	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']/../../../button[1]")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']")).sendKeys("Chikmagalur");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose destination, or click on the map...']/../../../button")).click();
	Thread.sleep(2000);





}
}
