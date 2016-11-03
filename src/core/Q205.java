package core;

public class Q205 {
public static void main(String[] args) {
	
	// insert code here
	//int [] [] arr = new int [] [4];//Cannot specify an array dimension after an empty dimension
	//YES--> int [] [] arr = new int [2] [ ];
	int [] [] arr = new int [2] [1];
	arr[0] = new int[3];
	arr[0][0] = 1;
	arr[0][1] = 2;
	arr[0][2] = 3;
	arr[1] = new int[4];
	arr[1][0] = 10;
	arr[1][1] = 20;
	arr[1][2] = 30;
	arr[1][3] = 40;
	System.out.println(arr[1][3]);
}
}
