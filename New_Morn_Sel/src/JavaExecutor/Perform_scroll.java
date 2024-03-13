package JavaExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Perform_scroll {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("---start-maximized");
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://www.amazon.in/");
	Thread.sleep(8000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
	jse.executeScript("window.scrollBy(0,250)");
	Thread.sleep(500);
	}
	for(int i=0;i<3;i++)
	{
	jse.executeScript("window.scrollBy(0,-250)");
	Thread.sleep(500);
	}
	
	
}
}
