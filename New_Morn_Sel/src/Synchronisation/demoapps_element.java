package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoapps_element {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("10");
	driver.findElement(By.xpath("//button[.='Start']")).click();
	WebElement ele=driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3r']"));
	Select sel=new Select(ele);
	sel.selectByValue("no");
}
	
}
