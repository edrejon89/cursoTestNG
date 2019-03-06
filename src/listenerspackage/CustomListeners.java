package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners implements IInvokedMethodListener, ITestListener ,ISuiteListener {
	//CustomeListener1
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		//Before every method in the Test Class	
		System.out.println("beforeInvocation " + testResult.getTestClass().getName() + " => " + method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation " + testResult.getTestClass().getName() + " => " + method.getTestMethod().getMethodName());

		//After every method in the Test Class	
	}
	
	
	//customListener2

	@Override
	public void onTestStart(ITestResult result) {
		// When test method starts
		System.out.println("onTestStart -> Test Name: " + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// If test method is successful
		System.out.println("onTestSuccess -> Test Name: " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// If test method is failed
		System.out.println("onTestFailure -> Test Name: " + result.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// If test method is skipped
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Ignore this
		
	}

	@Override
	public void onStart(ITestContext context) {
		// Before <test> tag of xml file
		System.out.println("onStart -> Test tag Name: " + context.getName());		
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag:");
		for(ITestNGMethod method : methods) {
			System.out.println(method.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// After <test> tag of xml file
		System.out.println("onFinish -> Test tag Name: " + context.getName());		
	}
	
	//Custome Listener 3
	
	@Override
	public void onStart(ISuite suite) {
		// when <suite> tag starts
		System.out.println("onStart: before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		// when <suite> tag completes
		System.out.println("onFinish: after suite completes");
		
	}

}
