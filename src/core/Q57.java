package core;

class Y123 extends Q57{
	public String tostring() {return "I am Y";}
}
interface Z123{}

public class Q57 implements Z123 {
	public String toString(){return "I am X";}
	
public static void main(String[] args) {
	Q57 realX=new Q57(); System.out.println(realX+" "+realX.getClass());
	Y123 myY=new Y123(); System.out.println(myY+" "+myY.getClass());
	Q57 myX=myY; System.out.println(myX+" "+myX.getClass());
	Z123 myZ=myX;	System.out.println(myZ+" "+myZ.getClass());
}
}
