package core;

import java.util.ArrayList;
import java.util.List;

class Alfa{
	public String doStuff(String msg){return msg;}
}

class Beta{
	public String doStuff(String msg){return msg.replace('a', 'e');}
}

class Gamma{
	public String doStuff(String msg){return msg.substring(2);}
}


public class Q123 {
public static void main(String[] args) {
	List strs=new ArrayList();
	Alfa alpha = new Alfa(); alpha.add("Java");
	Beta beta= new Beta(); beta.add("Java");
	Gamma gamma= new Gamma(); gamma.add("Java");
	
	strs.add(alpha);
	strs.add(beta);
	strs.add(gamma);
	for(Object t:strs) {
		System.out.println(t.doStuff("Java"));
	}
}
}
