package Santshsrasgn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Linksofwebpage_alternate_even {
	@Test
	public void href() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	   Thread.sleep(2000);
	  List<WebElement> links = driver.findElements(By.xpath("//a[position()mod 2=0]"));
	  int count = links.size();
	  for(int i=0;i<count;i++)
	  {
		  WebElement href = links.get(i);
		  String hr = href.getAttribute("href");
		  System.out.println(hr);
	  }
	}

}
