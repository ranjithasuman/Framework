package Reporting_tools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport {
	@Test
	public void report1()
	{
		ExtentReports reports = new ExtentReports("./reports/r.html",false);
		ExtentTest test=reports.startTest("testName");
		test.log(LogStatus.PASS,"tc_passed");
		test.log(LogStatus.FAIL,"tc_passed");
		test.log(LogStatus.SKIP,"tc_passed");
		reports.endTest(test);
		reports.flush();
		
		
	}

}
