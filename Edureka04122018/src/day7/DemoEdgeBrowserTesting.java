package day7;

public class DemoEdgeBrowserTesting {

	public static void main(String[] args) {
		WorkingWithFirefoxDriver wf = new WorkingWithFirefoxDriver();

		wf.invokeBrowser();

		System.out.println(wf.getLinkCount());

	}

}
