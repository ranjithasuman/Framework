package Dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Treeset_sort {
	private static final String Coolections = null;
@Test
	public static void sort() throws InterruptedException {
		
	

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
	TreeSet<String> ts = new TreeSet<String>();
	//TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());//reverse order
	for(WebElement opt:opts)
	{
		String txt = opt.getText();
		ts.add(txt);
		
		
	}
	int txt=ts.size();
	for(String tss:ts)
	{
		String tsss = tss.toString();
		System.out.println(tsss);
	}
	
	
	}}

