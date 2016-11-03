package core;

import java.io.IOException;

public class Q69 {

	public static void main(String[] args) {
		try {doStuff();	System.out.println("1");}
		catch(IndexOutOfBoundsException e) { System.out.println("2"); } finally {System.out.println();}} 
		
		public static void doStuff() {
		if (Math.random() > 0.5) throw new RuntimeException(); doMoreStuff();
		System.out.println("3 ");
		}
		public static void doMoreStuff() {
		System.out.println("4");
		}
		}