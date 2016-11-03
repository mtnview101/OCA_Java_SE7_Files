package core;

import java.util.*;

public class Q152 {
public static void main(String[] args) {
	List ps=new ArrayList();
	Patient p2=new Patient("Mike");
	ps.add(p2);
	int f=ps.indexOf(p2);
	//int f=psindexOf(Patient("Mike"));
	if(f>=0){System.out.println("Mike Found");}
}
}
