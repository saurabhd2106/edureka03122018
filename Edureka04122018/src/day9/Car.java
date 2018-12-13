package day9;

public class Car extends Machine {
	
	public Car(int engineSize) {
		super(engineSize);
		System.out.println("Car class constructor");
		
		engineSize = 90;
	}

	public void restart() {
		engineSize = 1000;
		System.out.println("Restart method from Car class");
	}

	public void reset() {
		System.out.println("Reset method from Car class");
		
		start();
	}

	@Override
	public void start(){
		System.out.println("I am in a start method of a car class");
	}
}
