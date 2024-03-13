package TakessScreenshot;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;




public class Capturingss {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//step1
		TakesScreenshot tss=(TakesScreenshot)driver;
		//step2
		File tmp=tss.getScreenshotAs(OutputType.FILE);
		//step3
		File pmt = new File("./Photo/defect1.jpg");
	
		//step4
		FileHandler.copy(tmp, pmt);

	}

}
