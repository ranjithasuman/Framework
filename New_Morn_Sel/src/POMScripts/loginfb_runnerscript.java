package POMScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginfb_runnerscript {
		@Test
		public void login() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			POMScrict2 p = new POMScrict2(driver);
			p.passData1();
			Thread.sleep(2000);
			p.passData2();
			Thread.sleep(2000);
			p.enter();
		}

	}


