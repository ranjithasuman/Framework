package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dropdpwn_sort {
		private static final String Coolections = null;

		public static void main(String[] args) throws InterruptedException {
			
		
	
	//public void fb() throws InterruptedException
	//{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    Thread.sleep(5000);
		 WebElement dd = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel=new Select(dd);
		List<WebElement> opts = sel.getOptions();
		int count = opts.size();
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement opt:opts)
		{
			String txt = opt.getText();
			l.add(txt);
			Collections.sort(l);
			//Collections.sort(l,Collections.reverseOrder());//reverse order
		}
		System.out.println(l);
		
		
		}}