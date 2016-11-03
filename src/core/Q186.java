package core;

public class Q186 {
		static String[][] arr =new String[3][];
		private static void doPrint() {
		//insert code here to print COJ
			/*
			for (int i = 0;i < arr.length;i++) 
			{ int j = arr[i].length-1; System.out.print(arr[i][j]); }  
			*/
			
			//for (int i = 0;i < arr.length;i++) 
			//{ int j = arr[i].length-1; System.out.print(arr[i][j]); /*i++;*/}
		
			System.out.print(arr[0][2]+arr[1][3]+arr[2][1]);
		
 }
		public static void main(String[] args) {
		String[] class1 = {"A","B","C"};
		String[] class2 = {"L","M","N","O"};
		String[] class3 = {"I","J"};
		arr[0] = class1;
		arr[1] = class2;
		arr[2] = class3;
		Q186.doPrint();
		}
		}
