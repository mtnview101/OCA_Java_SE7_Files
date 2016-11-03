package core;

public class Q37 {
public static void main(String[] args) {
	int[]array={1,2,3,4,5};
	System.arraycopy(array, 2, array, 1, 2);
	//System.arraycopy(src, srcPos, dest, destPos, length);
	System.out.print(array[0]);System.out.print(array[1]);System.out.print(array[2]);System.out.print(array[3]);
	System.out.println(array[4]);
}
}
