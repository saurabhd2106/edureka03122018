package day7;

public class DemoFirefoxDriver {

	public static void main(String[] args) {
		WorkingWithEdgeBrowser we= new WorkingWithEdgeBrowser();
		
		we.invokeBrowser();
		
		System.out.println(we.getLinkCount());

	}

}
