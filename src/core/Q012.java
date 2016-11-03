package core;

public class Q012 {
	String str="default";
	Q012(String s) {str=s;}
	void print(){System.out.println(str);}
	public static void main(String[] args) {
		
		new Q012("hello").print();
	}

}
