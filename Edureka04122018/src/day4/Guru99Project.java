package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/v4/");

	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public void login(String userId, String password){
		
		driver.findElement(By.name("uid")).sendKeys(userId);
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		
		passwordElement.sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer(){
		driver.findElement(By.linkText("New Customer")).click();
	}

}
