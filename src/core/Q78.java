package core;

public class Q78 {

	static void doSomething() {int [] ages = new int[4];ages[4] = 17; doSomethingElse();}
	static void doSomethingElse() {	throw new SpecialException("Thrown at end of doSomething() method"); }
	
	public static void main(String[] args) {
		try {
		doSomething();
		}
		catch (SpecialException e) {System.out.println(e);}
		                                   }

		}
