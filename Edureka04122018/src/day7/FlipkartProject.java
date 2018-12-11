package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {

	ChromeDriver driver;
	List<WebElement> allLink;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']")).click();

	}

	public void mouseHover() {

		WebElement elecLink = driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions action = new Actions(driver);

		action.moveToElement(elecLink).build().perform();

		WebElement samsungLink = driver.findElement(By.linkText("Samsung"));

		String urlOfSamsungLink = samsungLink.getAttribute("href");

		System.out.println("URL of samsung link : " + urlOfSamsungLink);

		System.out.println(driver.getTitle());

	}

	public int getLinkCount() {

		allLink = driver.findElements(By.tagName("a"));

		int count = allLink.size();

		return count;
	}

	public void printAllLinks() {

		for (WebElement link : allLink) {
			System.out.println(link.getText() + " and its url : " + link.getAttribute("href"));
		}
	}

}
