package core;

import java.util.ArrayList;

public class Q67 {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<>(1);
	System.out.println("list.size() "+list.size());
	list.add(1001);
	list.add(1002);
	//System.out.println(list.get(list.size()));
	System.out.println(list.size());
	System.out.println(list.get(0));
	System.out.println(list.get(1));
}
	
	
}
