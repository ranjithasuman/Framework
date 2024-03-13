package POMScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScrict2 {
	//declaration
		@FindBy(id="email")
		private WebElement uName;
		
		
		@FindBy(id="pass")
		private WebElement passwrd;
		
		@FindBy(linkText="Log in")
		private WebElement subm;
		
		//initialization
		
		public POMScrict2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void passData1()
		{
			uName.sendKeys("selenium");
		}
		public void passData2()
		{
			passwrd.sendKeys("admin@123");
		}
		public void enter()
		{
			subm.click();
		}
		
		

	}


