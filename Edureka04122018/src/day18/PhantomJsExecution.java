package day18;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJsExecution {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		File phantomExeFile = new File("C:/Users/Saurabh Dhingra/workspace/libs/phantomjs-2.1.1-windows/phantomjs-2.1.1-windows/bin/phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", phantomExeFile.getAbsolutePath());
		
		driver = new PhantomJSDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
		
		System.out.println(driver.getTitle());
	}

}
