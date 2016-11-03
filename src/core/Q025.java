package core;

public class Q025 {
public static void main(String[] args) throws Exception {
	doSomething();
}
private static void doSomething() throws Exception {
	System.out.println("Before IF clause");
	if(Math.random()>0.5) {throw new Exception();}
	System.out.println("After IF clause");
}
}
