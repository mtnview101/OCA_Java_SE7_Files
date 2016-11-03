package core;

public class MyClass15 {
	    static class RefType {
	        int val;
	        RefType(int val) {this.val = val;} }
	    
	    public static void main (String[] args) {
	        RefType x = new RefType(1);System.out.println(x.val);
	        RefType y = new RefType(1);System.out.println("init y: "+y.val);//System.out.println("object y: "+y);
	        y=x;
	        System.out.println(y==x);
	        RefType z = y;System.out.println(z.val);System.out.println();
	        z.val = 10;
	        System.out.println(x.val+" "+ y.val+" " + z.val);
	        }
	}
