package Runner_endtoend;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import POMScripts.POMScrict2;
import POM_endtoend.pom_ete;

//for this created 3 diff packages 1 is genericendtoend and pomendtoend and this one runeerscrptendend
public class runner_ete {

	@Test
	public void login() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		pom_ete p = new pom_ete(driver);
		Thread.sleep(2000);
		p.passData1("iphone");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		p.enter();
		Thread.sleep(2000);
		p.enter2();
		Thread.sleep(2000);
		
		
		
		
	}
}
