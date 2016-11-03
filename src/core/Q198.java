package core;
	public class Q198 {
		int x;
		int y;
		
		public void doStuff(int x, int y) {
											System.out.println("int x=>"+x+" int y=>"+y);
											System.out.println("ithis.x=>"+this.x+" this.y=>"+this.y);
											System.out.println();
											System.out.println("this.x = x; y =this.y; ");
			this.x = x; y =this.y; 
											System.out.println("int x=>"+x+" int y=>"+y);System.out.println();
											//System.out.println("this.x=>"+this.x+" y=>"+y);
											}
		
		public void display() {System.out.print(x + " " + y + " : ");}
		
		public static void main(String[] args) {
		Q198 m1 = new Q198();
		m1.x = 100;
		m1.y = 200;
		
		Q198 m2 = new Q198();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
		}
		}
