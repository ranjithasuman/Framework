package Generic_element_ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import TakessScreenshot.Generic_script_takess;

public class mainmthd_elemnt_ss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("----start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("email"));
		Generic_element_photo.get_photo_element(ele, "Ele1");
		WebElement pass = driver.findElement(By.id("pass"));
		Generic_element_photo.get_photo_element(pass,"Password");
		

	}

}
