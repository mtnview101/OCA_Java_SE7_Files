package core;
interface Pet{}
class Dogg implements Pet {}


public class Q204 extends Dogg{
	public static void main(String[] args) {
		Pet a = new Dogg(); 
		//Pet b = new Pet(); //Cannot instantiate the type Pet
		//Dogg f = new Pet(); 
		Dogg d = new Q204(); 
		Pet e = new Q204(); 
		//Q204 c = new Dogg();	//Type mismatch: cannot convert from Dogg to Q204
		
		
		
	}

}
