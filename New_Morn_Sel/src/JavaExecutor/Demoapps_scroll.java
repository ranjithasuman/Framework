package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Demoapps_scroll {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(8000);	
		Point p = driver.findElement(By.xpath("//h3[text()='b. Premium Materials']")).getLocation();
		int x = p.getX();
		int y = p.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		driver.get("https://demoapps.qspiders.com/ui/scroll");
		Thread.sleep(8000);	
		driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Thread.sleep(8000);
		JavascriptExecutor jse1=(JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(500,0)");
		
	
		
}

}
