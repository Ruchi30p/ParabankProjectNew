package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.TimeUtils;



public class BaseParabankClass {
	

	public static Properties prop= new Properties();
	public static WebDriver driver;
	public BaseParabankClass() {
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\ruchi\\eclipse-workspace\\ParabankProjectNew\\src\\test\\java\\environmentvariables\\Config.properties");
		
		prop.load(file);
	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
	public static  void  initiation() {
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	
	}
	
	
}
