package listenerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class CustomListener3 implements ISuiteListener {

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
