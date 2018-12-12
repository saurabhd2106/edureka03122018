package day8;

public class Car extends Machine {
	
	public Car(int engineSize) {
		super(engineSize);
		System.out.println("Car class constructor");
		
		engineSize = 90;
	}

	public void restart() {
		System.out.println("Restart method from Car class");
	}

	public void reset() {
		System.out.println("Reset method from Car class");
		
		start();
	}

}
