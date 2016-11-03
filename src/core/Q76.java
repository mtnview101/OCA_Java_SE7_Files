package core;

public class Q76 {
public static void main(String[] args) {
	String name = "Spot";
	int age = 4;
	String str ="My dog " + name + " is " + age;
	StringBuilder sb = new StringBuilder();
	sb.append("My dog " + name + " is " + age);
	System.out.println(sb);
	System.out.println(sb.reverse());
	//sb.insert(16,"My dog ").append( name + " is " + age); System.out.println(sb); 
	//sb.insert("My dog ").insert( name ).insert(" is " ).insert(age); System.out.println(sb); 
	sb.append("My dog ").append( name ).append(" is " ).append(age); System.out.println(sb);
}
}
