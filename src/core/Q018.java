package core;
class X1111{
	X1111() {/*to do something*/}
	protected void one() {System.out.println("one");}
}

public class Q018 extends X1111{
	Q018() {/*to do something*/}
	private void two() {one();}
	public static void main(String[] args) {
		new Q018().two();
	}

}
