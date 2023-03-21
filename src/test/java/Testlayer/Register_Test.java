package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;

public class Register_Test extends BaseParabankClass {


	Register_Test R;
	public Register_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		R=new Register_Test();
	}
	@Test
	public void Register_T() throws InterruptedException {
		Thread.sleep(2000);
		R.Register_T();
		Thread.sleep(4000);
		
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}

