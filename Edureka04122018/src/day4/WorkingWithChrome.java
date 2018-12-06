package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://qatechhub.com");
		
	}
	
	public String getTitleOfThePage(){
			
		return driver.getTitle();
	}
	
	public void navigateMethods(){
		driver.navigate().to("http://facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	}
	
	public void closeBrowser(){
		driver.close();
	}
	
	public void closeAllBrowser(){
		driver.quit();
	}
	

}
