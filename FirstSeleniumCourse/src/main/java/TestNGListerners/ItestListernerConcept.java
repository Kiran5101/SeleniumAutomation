package TestNGListerners;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListernerConcept implements ITestListener{

	public void onTestFinish(ITestResult result) {
	System.out.println("onFinish method finished"+result.getName());

	}
	public void onTestStart(ITestResult result) {
	System.out.println("onStart method started"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Method failed"+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("Method skipped"+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess"+result.getName());
	}

}
