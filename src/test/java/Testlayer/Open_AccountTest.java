package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;

public class Open_AccountTest extends BaseParabankClass{

		Open_AccountTest O;
		public Open_AccountTest() {
			super();
		}
		@BeforeMethod
		public void initsetup() {
			initiation();
			O=new Open_AccountTest();
		}
		@Test
		public void checking_account() throws InterruptedException {
			O.checking_account();
			
		}
		@Test
		public void savings_account() throws InterruptedException {
			O.savings_account();
		}
		@AfterMethod
		public void close() {
			driver.close();
		}
	}
		




