import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxesasscendecsnd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/webelementassign.html");
		Thread.sleep(2000);
		List<WebElement> cboxs = driver.findElements(By.xpath("//input"));
		int count=cboxs.size();
		for(int i=0;i<count;i++)
		{
			WebElement check = cboxs.get(i);
			check.click();
		}
		for(int i=count-1;i>=0;i-- )
		{
			WebElement check = cboxs.get(i);
			check.click();
		}
	}
	

}
