package day18;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridExecution {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		URL remoteUrl = new URL("http://192.168.0.3:4444/wd/hub");
		driver = new RemoteWebDriver(remoteUrl, capabilities);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://qatechhub.com");
	}

}
