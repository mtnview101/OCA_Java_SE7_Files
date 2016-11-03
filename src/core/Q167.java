package core;

public class Q167{
private static int x;
private static int y;
private static int sum;

public Q167(int nx, int ny) {x = nx; y =ny; updateSum();}
//public void setX(int nx) { x = nx; updateSum();}
//public void setY(int ny) { x = ny; updateSum();}

static void updateSum() { sum = x + y;}
public static void main(String[] args) {
	Q167(100,1);
	System.out.println(sum);
	
}
private static void Q167(int i, int j) {
	// TODO Auto-generated method stub
	x = i; y =j; updateSum();
	
}
}