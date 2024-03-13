package Annotaions_Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1 extends Generic_scipt2 {
	@Test
	public void validlogin()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		
		
	}
	@Test
	public void validlogin1()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
		
	}
	

}
