package core;

public class Q142 {
	private int x=0;
	private int y=0;
public static void main(String[] args) {
	Q142 accApp=new Q142();
	accApp.printThis(1,2);
	accApp.printThat(3,4);
	}

public void printThis(int x, int y){
	x=x;
	y=y;
	System.out.println("x: "+this.x+" y:"+this.y);
	//System.out.println("x: "+x+" y:"+y);
}
public void printThat(int x, int y){
	this.x=x;
	this.y=y;
	System.out.println("x: "+this.x+" y:"+this.y);
}

}
