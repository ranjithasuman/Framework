package Synchronisation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_loading {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String>all_id=driver.getWindowHandles();
		String pid = driver.getWindowHandle();
		all_id.remove(pid);
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			WebElement ele=driver.findElement(By.id("email"));
			//ele.sendKeys("ranjitha.0713gm@gmail.com");
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView();",ele);
		}
		
		

}
}
