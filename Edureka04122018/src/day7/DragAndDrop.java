package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver01122018/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");

		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		String colorOfTargetBeforeDragNDrop = target.getCssValue("color");
		Actions action = new Actions(driver);

		// action.dragAndDrop(source, target).build().perform();

		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		;

		String colorOfTargetAfterDragNDrop = target.getCssValue("color");

		System.out.println("Before Drag n Drop : " + colorOfTargetBeforeDragNDrop);

		System.out.println("After Drag n Drop : " + colorOfTargetAfterDragNDrop);
	}

}
