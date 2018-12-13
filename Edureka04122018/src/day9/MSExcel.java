package day9;

public class MSExcel implements MSOffice{

	@Override
	public void start() {
		System.out.println("Start method of MSExcel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("Save as method of MSExcel");
		
	}

	@Override
	public void save() {
		System.out.println("Save method of MSExcel");
		
	}
	
	public void open(){
		System.out.println("Open method from MSExcel");
	}

}
