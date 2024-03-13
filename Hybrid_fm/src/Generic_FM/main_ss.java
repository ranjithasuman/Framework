package Generic_FM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main_ss {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares1/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Generic_ss.get_photo(driver);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Generic_ss.get_photo(driver);
	

}
}