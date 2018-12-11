package day7;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");

		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		driver.switchTo().frame("iframeResult");
		
		//To switch back from a frame
		// driver.switchTo().defaultContent();
		
		driver.findElement(By.tagName("button")).click();
		

		String childWindow;
		Set<String> allSessionId = driver.getWindowHandles();
		
		childWindow = allSessionId.toArray()[1].toString();
		
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
