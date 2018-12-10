package day6;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartProject {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

	}

	public void mouseHover() {

		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']")).click();

		WebElement elecLink = driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions action = new Actions(driver);

		action.moveToElement(elecLink).build().perform();

		//waitTillElementVisible(10, By.linkText("Samsung"));

		fluentWait(10, 1, By.linkText("Samsung"));
		driver.findElement(By.linkText("Samsung")).click();

		System.out.println(driver.getTitle());

	}

	private void waitTillElementVisible(int timeOutInSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	private void fluentWait( int timeout, int pollingTime, By locator) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime))
				.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
