package core;

public class Q41 {
public static void main(String[] args) {
	doSomething();
}
private static void doSomething(){
	doSomethingElse();
}
private static void doSomethingElse(){

		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
