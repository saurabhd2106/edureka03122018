package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring a variable
		Employee soru;
		
		//Instantiation and Initialization
		soru = new Employee();
		
		soru.salary = 70000;
		soru.bonus = 8000;
		
		soru.calculateSalary();
		

		//-----------------------------------------
		
		Employee jacob = new Employee();
		
		jacob.salary = 68000;
		jacob.bonus = 8000;
		
		jacob.calculateSalary();
	}

}
