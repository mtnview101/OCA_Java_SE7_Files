package core;

public class Q004 {
	int z=111;
	public static void main(String[] args) {
		Q004 myScope=new Q004();
		int z=6;
		System.out.println(z);
		myScope.doStuff();
		System.out.println(z);
		System.out.println(myScope.z);
	}
	void doStuff() {
		int z=5;
		doStuff2();
		System.out.println(z);
		
	}
	void doStuff2() {
		z=4;
		
	}

}
