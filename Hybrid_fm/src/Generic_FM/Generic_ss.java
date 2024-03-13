package Generic_FM;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_ss {
	public static void get_photo(WebDriver driver) {
		 Date d = new Date();//recnt photo to be on top so date
		String d1 = d.toString();
		String da = d1.replaceAll(":", "-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File tmp=tss.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./Photo/"+da+".jpg");//concat with date ie da
		try{
			FileHandler.copy(tmp, pmt);
		}
		catch(IOException e)
		{
			System.out.println("photo is not captured");
			e.printStackTrace();
		}
		
		
	}

}