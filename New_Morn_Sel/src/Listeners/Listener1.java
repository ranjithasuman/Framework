package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("tc skipped");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("exec started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc passed");
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
