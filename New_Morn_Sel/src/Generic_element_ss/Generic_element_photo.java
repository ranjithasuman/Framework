package Generic_element_ss;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Generic_element_photo {
	public static void get_photo_element(WebElement ele,String txt) {
		File tmp=ele.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./element_Photo/"+txt+".jpg");
		try{
			FileHandler.copy(tmp, pmt);
		}
		catch(IOException e)
		{
			System.out.println("file not found");
			e.printStackTrace();
		}
		
	}
}
