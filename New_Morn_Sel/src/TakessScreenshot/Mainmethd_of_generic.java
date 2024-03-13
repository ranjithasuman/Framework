package TakessScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mainmethd_of_generic {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Generic_script_takess.get_photo(driver);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Generic_script_takess.get_photo(driver);
	

}
}