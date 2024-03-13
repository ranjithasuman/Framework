package JavaExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fblink_amazon_sroll {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		Thread.sleep(8000);
		Point p = driver.findElement(By.linkText("Facebook")).getLocation();
		int x = p.getX();
		int y = p.getY();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}

}
