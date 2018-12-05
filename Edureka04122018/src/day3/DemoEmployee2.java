package day3;

public class DemoEmployee2 {

	public static void main(String[] args) {
		Employee2 saurabh = new Employee2();

		saurabh.setSalary(90000);

		saurabh.setBonus(8000);

		System.out.println(saurabh.calculateSalary());
		
		System.out.println(saurabh.getSalary());
	}

}
