package core;

public class Q157 {
public static void main(String[] args) {
	Dog d1=new Dog();
	Dog d2=new Dog();
	Dog d3=d2;
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
}

}

class Dog{
	Dog(){
		try{
			throw new Exception();
		}catch(Exception e){}
	}
}
