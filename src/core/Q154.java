package core;


public class Q154 {
	static boolean isAvailable=false;
	public static boolean doStuff(){return !isAvailable;}
	
	
public static void main(String[] args) {
	Q154 ts=new Q154();
	System.out.print(isAvailable+" ");
	isAvailable=ts.doStuff();
	System.out.println(isAvailable);
}
}
