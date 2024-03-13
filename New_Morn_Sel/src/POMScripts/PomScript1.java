package POMScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript1 {
	
	//declaration
	@FindBy(id="email")
	private WebElement uName;
	
	//initialization
	public PomScript1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void passData()
	{
		uName.sendKeys("selenium");
	}
	

}
