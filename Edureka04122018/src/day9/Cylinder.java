package day9;

public class Cylinder extends ThreeDShape{

	@Override
	public double calculateArea(int len) {
		double areaOfBase;
		areaOfBase = Math.PI * len * len;
		return areaOfBase;
	}

}
