package sadhanatest;

public class Radius {
	double radius;
	
	public double calculaterad(int x1,int x2,int y1,int y2 ) {
		return  Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	}

	public double getRadius() {
		return radius;
	}

	public Radius() {
	
	}

	
	

}
