package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingBackwardForwadingRefreshActions {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    //to launch the empty browser
	    WebDriver driver = new ChromeDriver();
	    //launch the url without get();
	    driver.navigate().to("https://www.facebook.com");
	    Thread.sleep(2000);
	    //to perform backward action
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //to perform forward action
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    //to perform refresh action
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    //to close the browser
	    driver.close();
	    
	     
	}

}
