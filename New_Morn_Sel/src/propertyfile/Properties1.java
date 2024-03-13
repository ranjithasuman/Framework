
package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;


public class Properties1 {
	@Test
	public void fetchprop() throws FileNotFoundException, IOException{
		Properties p=new Properties();
		p.load(new FileInputStream("./dummy.properties"));
		String val = p.getProperty("baseURL");
		System.out.println(val);
		
	}

}
