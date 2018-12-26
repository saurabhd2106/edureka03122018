package day10;

public class DemoMultipleBrowser {

	public static void main(String[] args) {
		MultipleBrowserTesting mp = new MultipleBrowserTesting();
		
		try {
			mp.invokeBrowser("safari");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
