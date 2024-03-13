package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchtitleCurrentUrlPagesource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares1/chromedriver.exe");
		//to launch the empty browser
		WebDriver driver = new ChromeDriver();
		//to launch url
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		//to fetch the title
		String title=driver.getTitle();
		System.out.println(title);
		//to fetch the current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//to fetch the currentpagesource
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		driver.close();
		
	}

}
