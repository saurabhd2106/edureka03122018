package day7;

public class DemoFlipkart {

	public static void main(String[] args) {
		FlipkartProject fp = new FlipkartProject();

		fp.invokeBrowser();

		fp.mouseHover();

		System.out.println(fp.getLinkCount());
		
		fp.printAllLinks();

	}

}
