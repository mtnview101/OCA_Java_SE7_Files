package core;

class X_18 {
X_18(){};
protected void one(){System.out.println("X_18");}
}

public class Y extends X_18 { 
	//Y() {} 
	/*private*/ void two() {one();}
	
	public static void main(String[] args) {
		new Y().two();
	}
}