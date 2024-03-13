package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrlWithoutget {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		//to launch the empty browser
		WebDriver driver=new ChromeDriver();
		//to launch the url without get
		driver.navigate().to("https://www.amazon.com");
		driver.close();
	}

}
