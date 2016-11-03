package core;

public class Circle{
	double radius;
	public double area;
	public Circle(double r){radius=r;}
	public double getRadius(){return radius;}
	private void setRadius(double r){radius=r;}
	public double getArea(){
		area=Math.PI * getRadius()* getRadius();
		return area;}
}
