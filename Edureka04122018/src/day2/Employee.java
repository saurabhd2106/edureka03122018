package day2;

public class Employee {

	int salary;
	int bonus;

	void calculateSalary() {
		int totalSalary = salary + bonus;

		System.out.println("Total Salary : " + totalSalary);
	}

}
