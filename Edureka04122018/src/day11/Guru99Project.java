package day11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Guru99Project {

	WebDriver driver;
	
	@Parameters("browserType")
	@BeforeClass(alwaysRun=true)
	public void invokeBrowser(String browserType) {

		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/geckodriver-v0.20.1-win64/geckodriver.exe");

			driver = new FirefoxDriver();
		} else if (browserType.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser type : " + browserType);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/v4");


	}
	
	@AfterClass(alwaysRun=true)
	public void closeBrowser(){
		driver.quit();
	}
	
	@Test(priority=0)
	public void verifyTitleOfThePage(){
		String expectedTitle = "Guru99 Bank Home Page 1";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Parameters({"userId", "userPassword"})
	@Test(priority=1000, groups="Sanity")
	public void login(String userId, String password) {

		driver.findElement(By.name("uid")).sendKeys(userId);

		WebElement passwordElement = driver.findElement(By.name("password"));

		passwordElement.sendKeys(password);

		driver.findElement(By.name("btnLogin")).click();
	}

}
