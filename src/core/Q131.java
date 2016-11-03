package core;

import java.util.ArrayList;

public class Q131 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	
	list.add("SE1");
	list.add("EE");
	list.add("ME");
	list.add("SE");
	list.add("SE");
	
	list.remove("SE");
	System.out.println("Value are: \t"+list);
	
}
}
