package day9;

public class DemoMSOffice {

	public static void main(String[] args) {
		MSExcel msExcel = new MSExcel();
		
		msExcel.start();
		
		msExcel.save();
		
		msExcel.open();
		
		MSOffice msOffice = new MSExcel();
		
		msOffice.save();

	}

}
