package day7;

public class DemoAmazon {

	public static void main(String[] args) {
		AmazonProject ap = new AmazonProject();
		
		ap.invokeBrowser();
		ap.searchProduct("Apple Watch", "Watches");

		String nthProduct = ap.getNthProduct(7);
		
		System.out.println(nthProduct);
		
		ap.printAllProductsViaJavaScript(); 
	}

}
