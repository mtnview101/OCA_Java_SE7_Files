package core;

public class Q169{
public static void main(String[] args) {
	/*A-->NO
	Square square = new Square ("bar"); 
	square.foo ("bar"); 
	square.foo();
	*/
	/*NO
	Square square = new Square ("bar"); 
	square.foo ("bar"); 
	square.foo ("bar");
	*/
	
	/*NOSquare square = new Square (); square.foo (); square.foo(bar)*/
	
	/*NO Square square = new Square (); square.foo (); square.foo("bar");*/
	
	Square square = new Square(); square.foo("bar"); square.foo();
}
}

class Shape1 {
public Shape1() {System.out.println("Shape1: constructor");}
public void foo() {System.out.println("Shape1: foo");}
}

class Square extends Shape1 {
	public Square() {super();}
public Square(String label) {System.out.println("Square: constructor");}
public void foo() {super.foo();}
public void foo(String label) {System.out.println("Square: foo");}

}

