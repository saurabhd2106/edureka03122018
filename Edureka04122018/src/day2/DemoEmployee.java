package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring a variable
		Employee saurabh;
		
		//Instantiation and Initialization
		saurabh = new Employee();
		
		saurabh.salary = 70000;
		saurabh.bonus = 8000;
		
		saurabh.calculateSalary();
		

		//-----------------------------------------
		
		Employee jacob = new Employee();
		
		jacob.salary = 68000;
		jacob.bonus = 8000;
		
		jacob.calculateSalary();
	}

}
