package core;

public class Q212 {

	public static void main(String[] args) {
		String[] colors = {"red123456", "blue","green","yellow","maroon","cyan"};
		int count = 0;
		
		for (String c : colors) {if (count >= 4) {break;} else {continue;}
		
								//System.out.println("c.length()=>"+c.length());
								//if (c.length() >= 4) {colors[count] = c.substring(0,3);	}
								//count++;System.out.println(count);
								}
		
		System.out.println(colors[count]);
		}
		}
