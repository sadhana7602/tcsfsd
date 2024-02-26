package sadhanatest;



public class Circle {
	

	Radius r;
    public void setRadius(Radius r) {
    	this.r=r;
    }
	
   
	public double area(int x1,int x2,int y1,int y2) {
		 double rad=r.calculaterad(x1, x2, y1, y2);
		return 3.14*rad*rad;
	}

}
