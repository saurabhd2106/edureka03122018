package day11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	@Test(dataProvider="getTestData")
	public void printTestData(String username, String password) {
		System.out.println("Username : " + username + " and its password : " + password);
	}
	
	@Test(dataProvider="getMultipleTestData")
	public void printTestData(String username, int Id) {
		System.out.println("Username : " + username + " and its id : " + Id);
	}
	
	@DataProvider
	public String[][] getTestData(){
		String[][] data = new String[3][2];
		
		data[0][0] = "Saurabh";
		data[0][1] = "Pro@1234";
		
		data[1][0] = "Gaurav";
		data[1][1] = "Pro@xyz";
		
		data[2][0] = "Rohit";
		data[2][1] = "Pro@2432";
		
		return data;
	}
	
	@DataProvider
	public Object[][] getMultipleTestData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Saurabh";
		data[0][1] = 4385783;
		
		data[1][0] = "Gaurav";
		data[1][1] = 34234;
		
		data[2][0] = "Rohit";
		data[2][1] = 12133;
		
		return data;
	}


}
