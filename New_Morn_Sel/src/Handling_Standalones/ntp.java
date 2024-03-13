package Handling_Standalones;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ntp {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			Thread.sleep(2000);
			Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Autoit\\notpractice.exe");
		}
	}



