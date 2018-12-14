package day10;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageUpload {
	
	ChromeDriver driver;
	
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://images.google.com/");

	}
	
	public void uploadImage() throws IOException{
		driver.findElement(By.className("S3Wjs")).click();
		
		driver.findElement(By.linkText("Upload an image")).click();
		
		driver.findElement(By.id("qbfile")).click();
		
		Runtime.getRuntime().exec("C:/Users/Saurabh Dhingra/git/edureka03122018/Edureka04122018/scripts/upload.exe");
	}


}
