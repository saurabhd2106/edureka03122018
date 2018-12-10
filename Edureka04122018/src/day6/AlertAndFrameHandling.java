package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.switchTo().frame("iframeResult");
		
		//To switch back from a frame
		// driver.switchTo().defaultContent();
		
		driver.findElement(By.tagName("button")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);
		System.out.println(alert.getText());
		
		alert.accept();
	}

}
