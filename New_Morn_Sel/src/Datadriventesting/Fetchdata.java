package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Fetchdata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//step1
		
		FileInputStream fis = new FileInputStream("./Excel1/Seleniumtestdata.xlsx");
		
		//step2
		
		Workbook book = WorkbookFactory.create(fis);
		
		//step3
		
		Sheet sh = book.getSheet("Sheet1");
		
		//step4
		
		Row r=sh.getRow(2);
		
		//step5
		
		Cell cel = r.getCell(2);
		
		//STEP6
		
		
		String value=cel.toString();
		System.out.println(value);
		
		
		
		
		
		
		
	}

}
