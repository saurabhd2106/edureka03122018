package day12;

public class Guru99TestClass {

	public void invokeBrowser() {
		System.out.println("Invoke Browser");
	}

	public void login() throws ArrayIndexOutOfBoundsException, Exception{

		int[] arr = new int[5];

		
		arr[0] = 10;
		arr[1] = 13;
		arr[2] = 23;
		arr[3] = 78;
		arr[4] = 90;

		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Login to app");
	}

	public void addUser() {
		System.out.println("Add User");
	}

	public void logout() {
		System.out.println("Logout from app");
	}

	public void closeBrowser() {
		System.out.println("Close Browser");
	}
}
