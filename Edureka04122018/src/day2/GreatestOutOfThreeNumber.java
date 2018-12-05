package day2;

public class GreatestOutOfThreeNumber {

	public static void main(String[] args) {

		int firstNumber, secondNumber, thirdNumber;

		firstNumber = 99;
		secondNumber = 89;
		thirdNumber = 99;

		if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
			System.out.println("First number is greatest");
		} else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
			System.out.println("Second number is greatest");
		} else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
			System.out.println("Third number is greatest");
		} else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
			System.out.println("First and Second number are greater than third");
		} else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
			System.out.println("First and Third number are greater than second");
		} else if (thirdNumber == secondNumber && firstNumber < thirdNumber) {
			System.out.println("Third and Second number are greater than First");
		} else {
			System.out.println("All are equal");
		}

	}

}
