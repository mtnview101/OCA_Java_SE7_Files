package core;

public class Q126 extends Root {
static Root r=new Q126();
public static void main(String[] args) {

System.out.println(r.method1());
System.out.println(r.method2());	
}
}
class Root{
	private static final int MAX=20000;
	protected int method1(){int a=100+MAX;return a;}
	protected int method2(){int a=200+MAX;return a;}
}
