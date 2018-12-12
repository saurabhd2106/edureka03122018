package day8;

public class Shape {

	public double calculateArea(int len, int wid) {
		double area;
		area = len * wid;

		return area;
	}
	
	public double calculateArea(int side) {
		double area;
		area = side * side;

		return area;
	}
	
	public double calculateArea(double radius) {
		double area;
		area = Math.PI * radius * radius;

		return area;
	}
}
