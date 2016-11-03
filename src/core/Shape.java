package core;

public abstract class Shape{
	private int x;
	private int y;
	public abstract void draw();
	public static void setAnchor(int x, int y){
		x=x;
		y=y;
		System.out.println(x+y);
	}
}
