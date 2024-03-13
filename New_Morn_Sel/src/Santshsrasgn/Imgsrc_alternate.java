package Santshsrasgn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Imgsrc_alternate {
	@Test
	public void href() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	   Thread.sleep(2000);
	  List<WebElement> links = driver.findElements(By.xpath("//img[position()mod 2=1]"));
	  int count = links.size();
	  for(int i=0;i<count;i++)
	  {
		  WebElement src = links.get(i);
		  String imgsrc = src.getAttribute("src");
		  System.out.println(imgsrc);
	  }
	}

	

}
