package day9;

public class Cuboid extends ThreeDShape {

	@Override
	public double calculateArea(int len) {
		double areaOfBase;
		areaOfBase = len * len;
		return areaOfBase;
	}

}
