package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingMultipledata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./Excel1/Seleniumtestdata.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		 Sheet sh=book.createSheet("FlipKart");
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			int count = links.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				WebElement link = links.get(i);
				String att = link.getAttribute("href");
				Row r = sh.createRow(i);
				Cell cel = r.createCell(0);
				cel.setCellValue(att);
				
			}
			FileOutputStream fout = new FileOutputStream("./Excel1/Seleniumtestdata.xlsx");
			book.write(fout);
			}
			
		
	

}
