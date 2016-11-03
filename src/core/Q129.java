package core;

class Star{public void doStuff() {System.out.println("Twinkling Star");}}
interface Universe{ public void doStuff();}
class Sun extends Star implements Universe {public void doStuff() {System.out.println("Shining Sun");}}

public class Q129 {
public static void main(String[] args) {
	/*
	Sun obj2=new Sun();
	Star obj3=obj2;
	
	((Sun)obj3).doStuff();
	((Star)obj2).doStuff();
	((Universe)obj2).doStuff();
	
	(obj3).doStuff();
	(obj2).doStuff();
	(obj2).doStuff();
	*/
	
	Sun obj2=new Sun();
	Star obj3=new Star();
	Star obj1=(Star)obj3;

		
	((Sun)obj2).doStuff();
	((Star)obj2).doStuff();
	obj1.doStuff();
	((Universe)obj2).doStuff();
	
}
}
