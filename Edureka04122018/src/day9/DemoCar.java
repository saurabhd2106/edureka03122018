package day9;

public class DemoCar {

	public static void main(String[] args) {
		Machine mac = new Machine();
		mac.engineSize = 2000;
		mac.start();
		mac.stop();
		
		System.out.println("---------------------------");
		Car alto = new Car(10);
		alto.start();
		alto.stop();
		alto.reset();
		alto.restart();
		
		
		System.out.println("---------------------------");
		Machine fordFigo = new Car(10);
		
		fordFigo.start();
		

	}

}
