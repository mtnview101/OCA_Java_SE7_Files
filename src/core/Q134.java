package core;

public class Q134 {
	private char var;
	public static void main(String[] args) {
		char var1='a';
		char var2=var1;
		var2='e';
		
		Q134 obj1=new Q134();
		Q134 obj2=obj1;
		obj1.var='i';
		obj2.var='o';
		
		System.out.println(var1+", "+var2);
		System.out.println(obj1.var+", "+obj2.var);
	}
}
