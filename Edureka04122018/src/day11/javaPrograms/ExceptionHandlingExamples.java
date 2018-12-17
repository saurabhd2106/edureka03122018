package day11.javaPrograms;

public class ExceptionHandlingExamples {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try{
			
			arr[0] = 10;
			arr[1] = 13;
			arr[2] = 23;
			arr[3] = 78;
			arr[4] = 90;
			
			for(int i=0; i<=5; i++){
				System.out.println(arr[i]);
			}
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound exception occured");
		}
		
		
		System.out.println("After exception");
	}

}
