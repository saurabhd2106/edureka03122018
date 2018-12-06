package day4;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		
		String titleOfThePage= wc.getTitleOfThePage();
		
		System.out.println("Title of the page : "+ titleOfThePage);

		wc.navigateMethods();
		
		wc.closeAllBrowser();
	}

}
