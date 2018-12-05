package day3;

public class Employee2 {

	private int salary;
	private int bonus;

	public void setSalary(int salary) {

		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.err.println("Invalid Salary");
		}
	}

	public void setBonus(int bonus) {

		if (bonus >= 0) {
			this.bonus = bonus;
		} else {
			System.err.println("Invalid Bonus");
		}
	}

	public int getSalary() {
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

	int calculateSalary() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

}
