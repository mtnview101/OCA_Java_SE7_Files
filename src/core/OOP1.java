package core;

public class OOP1 {

	private int[] array;
public void calculate(int a, int b) {
	this.array = new int[b-a];
	for(int i =0; i< this.array.length; ++i){
		this.array[i] = a+i;
	}
}
public int[] numbers() {
	return this.array; }


public static void main(String[] args) {
	OOP1 c = new OOP1();
	c.calculate(5, 15);
	int[] x = c.numbers();
	System.out.println(x);
}
}