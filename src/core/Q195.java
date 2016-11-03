package core;
	public class Q195 {
		static int i;
		int j;
		
		public static void main(String[] args) {
		Q195 x1 = new Q195();
		Q195 x2 = new Q195();
		System.out.println("i= "+i);System.out.println();
		x1.i = 3; System.out.println("Assign x1.i=3 for class variable, it's mean that var will change for every method in class x1.i=> "+x1.i);
		x1.j = 4; System.out.println("x1.j= "+x1.j);
		x2.i = 5; System.out.print("x2.i= "+x2.i); System.out.println(" and x1.i will changed too => "+x1.i);
		x2.j = 6; System.out.println("x2.j= "+x2.j); System.out.println();
		
		System.out.println(
		x1.i + " "+
		x1.j + " "+
		x2.i + " "+
		x2.j);
		}
		}
