package core;

public class Q119 {
public static void main(String[] args) {
	String[] colors={"red","blue","green","yellow","maroon","cyan"};
	/*for (String c:colors) {
		if(c.length()!=4) {continue;} System.out.print(c+", ");
	}*/
	/*for (String c:colors[]) {
		if(c.length()!=4) {continue;} System.out.print(c+", ");
	}*/
	for (String c:colors) {
		if(c.length()!=4) { System.out.print(c+", ");} continue;
	}
	
}
}
