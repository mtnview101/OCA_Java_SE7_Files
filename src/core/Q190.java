package core;

public class Q190 {

	public static void main(String[] args) {
		try {
		StringBuilder[] arr =new StringBuilder[4];
		arr[1] = new StringBuilder("Unix");
		arr[2] = new StringBuilder("Linux");
		arr[3] = new StringBuilder("Solarios");
		for (StringBuilder var : arr) {	System.out.print(var + " ");}
		} catch(Exception e) {
		System.out.print (e.getClass());
		}
		}
		}