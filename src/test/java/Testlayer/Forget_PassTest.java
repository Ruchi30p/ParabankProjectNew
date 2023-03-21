package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;

public class Forget_PassTest extends BaseParabankClass {
		Forget_PassTest F;
		public Forget_PassTest() {
			super();
		}
		@BeforeMethod
		public void initsetup() {
			initiation();
			F=new Forget_PassTest();
		}
		@Test
		public void forget_password() throws InterruptedException {
			F.forget_password();
		}
		@AfterMethod
		public void close() {
			driver.close();
		}

	}


