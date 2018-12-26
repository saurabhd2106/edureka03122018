package day12;

public class DemoGuru99Class {

	public static void main(String[] args) {
		Guru99TestClass guru = new Guru99TestClass();
		try {

			guru.invokeBrowser();

			guru.login();

			guru.addUser();

			guru.logout();

		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			guru.closeBrowser();
		}

	}

}
