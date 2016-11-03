package core;
class XX {
	public void mXX(){System.out.println("xM1");}}
class YY extends XX {
	public void mXX(){System.out.println("XXm2");	}
	public void mYY(){System.out.println("YYm");	}
}

public class Q109 {
public static void main(String[] args) {
	XX xRef=new YY();
	YY yRef=(YY)xRef;
	yRef.mYY();
	xRef.mXX();
}
}
