package day9;

public abstract class ThreeDShape {
	
	public double calculateVoulme(int len, int height){
		
		double volume;
		
		volume = calculateArea(len) * height;
		
		return volume;
		
	}
	
	public abstract double calculateArea(int len);

}
