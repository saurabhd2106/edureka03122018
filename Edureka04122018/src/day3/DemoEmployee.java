package day3;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee saurabh = new Employee();

		saurabh.salary = -90000;
		saurabh.bonus = -7000;

		int salary = saurabh.calculateSalary1();
		System.out.println("Salary of saurabh : " + salary);

		System.out.println("-------------------------------");

		Employee jacob = new Employee();

		jacob.salary = 80000;
		jacob.bonus = 9000;

		int salaryOfJacob = jacob.calculateSalary3(85000, 9100);

		System.out.println("Jacob's salary : " + salaryOfJacob);
	
		System.out.println("---------------------------------");
		
		Employee parul = new Employee(60000,3000);
		
		parul.calculateSalary();
	}

}
