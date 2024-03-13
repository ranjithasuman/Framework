package GenericScript;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class generic_fetchdata {
	public static String getdata(String file_path,String Sheet_name,int ro,int c) {
		
	
	FileInputStream fis;
	Workbook book=null;
	try
	{
		fis=new FileInputStream(file_path);
		book=WorkbookFactory.create(fis);
	}
	catch(Exception e)
	{
		System.out.println("file not found");
		e.printStackTrace();
		
	}
	Sheet sh=book.getSheet(Sheet_name);
	Row r=sh.getRow(ro);
	Cell cel=r.getCell(c);
	String value=cel.toString();
	return value;
	
	}

}
