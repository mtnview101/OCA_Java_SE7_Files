package core;

public class Q135 {
	double radius;
	//public double area;
	public Q135 (double r){radius=r;}
	public double getRadius(){return radius;}
	public void setRadius(double r){radius=r;}
	public double getArea(){return (Math.PI*getRadius()*getRadius());}
	
	static class App{
		public static void main(String[] args) {
			Q135 c1=new Q135(17.4);
			//c1.area=Math.PI*c1.getRadius()*c1.getRadius();
			System.out.println(c1.getArea());
		}
	}
	
}
