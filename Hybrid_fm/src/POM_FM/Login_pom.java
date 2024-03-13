package POM_FM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import Generic_FM_ANNOTATIONS.Baseclass;
import Generic_FM_ANNOTATIONS.Basepage;
import Generic_FM_ANNOTATIONS.Baseclass;

	public class Login_pom extends Basepage {
		//declaration
			@FindBy(id="email")
			private WebElement uName;
			
			
			@FindBy(id="pass")
			private WebElement passwrd;
			
			@FindBy(linkText="Log in")
			private WebElement subm;
			
			//initialization
			
			public Login_pom(WebDriver driver)
			{
				super(driver);
				//PageFactory.initElements(driver, this);
				 
			}
			
			//utilization
			public void passData1(String un)
			{
				uName.sendKeys(un);
			}
			public void passData2(String pwd)
			{
				passwrd.sendKeys(pwd);
			}
			public void enter()
			{
				subm.click();
			}
			
			

		}



