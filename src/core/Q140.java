package core;

import java.util.ArrayList;
import java.util.List;

public class Q140 {
	
	public static List data=new ArrayList();
	
	static List update (String[] strs){
		for(String x:strs){data.add(x);}
		return data;
	}
	
	
public static void main(String[] args) {
	String[] d={"a","b","c"};
	update(d);
	System.out.println(data);
}
}
