package GenericScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fetch_data_from_generic {
	public static void main(String[] args) throws InterruptedException {
		
	
	String un=generic_fetchdata.getdata("./Excel1/Seleniumtestdata.xlsx","Sheet1",1,0);
	System.out.println(un);
	String pwd=generic_fetchdata.getdata("./Excel1/Seleniumtestdata.xlsx","Sheet1",1,1);
	System.out.println(pwd);
	
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com//");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sumandhanya478@gmail.com");//un already written in excel so un
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Log in']")).click();//or submit also we can use instead of .click()
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='Search']")).click();
	Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ranjitha");
			Thread.sleep(10000);
			String idd=generic_fetchdata.getdata("./Excel1/Seleniumtestdata.xlsx","Sheet1",2,2);
			System.out.println(idd);
	
	
	}
}
