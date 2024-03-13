package Dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ranjitha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("ranjitha.0713gm@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("RanjInch777");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("day"));
		Select sel = new Select(ele);
		Thread.sleep(2000);
		sel.selectByValue("13");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("month"));	
		Select sel1 = new Select(ele1);
		Thread.sleep(20000);
		  List<WebElement> options = sel.getOptions();
		   ArrayList<String> months = new  ArrayList<>();
		   for(WebElement l : options)
		   {
		    String text = l.getText();
		    System.out.println(text);
		sel1.selectByVisibleText("Jul");
		
		WebElement ele2 = driver.findElement(By.id("year"));	
		Select sel2 = new Select(ele2);
		Thread.sleep(2000);
		sel2.selectByVisibleText("1997");
		
		
		
		
	
		
		   }	
		

		
	}
}
