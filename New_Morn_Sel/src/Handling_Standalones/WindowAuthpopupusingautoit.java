package Handling_Standalones;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthpopupusingautoit {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Autoit\\windowauth.exe");
		
	}
}
