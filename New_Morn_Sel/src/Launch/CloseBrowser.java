package Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//empty browser launch
		WebDriver driver=new ChromeDriver();
		//launch url
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//close the browser specific tab
		driver.close();
		
		//close the entire browser
		driver.quit();
		
	}
}

