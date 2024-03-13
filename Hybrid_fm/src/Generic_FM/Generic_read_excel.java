package Generic_FM;


	import java.io.FileInputStream;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	import org.apache.poi.ss.usermodel.Cell;
	
	public class Generic_read_excel {

		public static String getdata(String Sheet_name,int ro,int c) {
			
		String val="";
				
		try{
			FileInputStream fis=new FileInputStream("./Excel2/Seleniumtestdata.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Cell cl=wb.getSheet(Sheet_name).getRow(ro).getCell(c);
			val=cl.getStringCellValue();
		}catch(Exception e)
		{
			System.out.println("unable to fetch data");
			
		}
		
			return val;
			
		}

	}


