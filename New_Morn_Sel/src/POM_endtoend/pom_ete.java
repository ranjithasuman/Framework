package POM_endtoend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_ete {
	public WebDriver driver;
	//declaration
			@FindBy(linkText="Mobiles")
			private WebElement mob;
			
			
			@FindBy(name="q")
			private WebElement search;
			
			//@FindBy(className="L0Z3Pu")
			//private WebElement subm;
			
			
			@FindBy(xpath="//div[.='Apple iPhone 14 (Starlight, 128 GB)']")
			private WebElement clk;
			
			//@FindBy(className="_3QN6WI")
			//private WebElement lap;
			
			
			
			//initialization
			
			public pom_ete(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			/*public void passData1()
			{
				uName.sendKeys("selenium");
			}
			public void passData2()
			{
				passwrd.sendKeys("admin@123");
			}*/
			public void enter()
			{
				mob.click();
			} 
			
			public void passData1(String mobnme)
			{
				search.sendKeys((mobnme));
			}
			/*public void enter1()
			{
				subm.click();
			} */
			public void enter2()
			{
				clk.click();
			} 
			
			
			
			
			

		}


