package day11;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingBasics {
	
	@Test(priority=0)
	public void testcase1(){
		System.out.println("Executing test case 1");
	}
	
	@Test(priority=1, groups={"Sanity"})
	public void testcase4(){
		System.out.println("Executing test case 4");
	}
	
	@Test(priority=2, groups={"Sanity", "Regression"})
	public void testcase3(){
		System.out.println("Executing test case 3");
	}
	
	@Test(priority=-1, enabled=true, groups={"Regression"})
	public void testcase5(){
		System.out.println("Executing test case 5");
	}
	
	@BeforeMethod(groups="Sanity")
	public void beforeATestcase(){
		System.out.println("Executing before a test case");
	}
	
	@AfterMethod(groups="Sanity")
	public void afterATestcase(){
		System.out.println("Executing after a test case");
	}
	
	@BeforeClass(alwaysRun=true)
	public void beforeAClass(){
		System.out.println("First method to be executed in this class");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterAClass(){
		System.out.println("Last method to be executed in this class");
	}
}
