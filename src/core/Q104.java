package core;

class MissingInfoException extends Exception{}
class AgeOutofRangeException extends Exception{}


class Candidate{
	String name;
	int age;
	Candidate(String name, int age) throws Exception{
		if (name==null) {throw new MissingInfoException();}
		else{
			this.name=name;
			this.age=age;
		}
	}
	public String toString(){
		return name+" age:"+age;
	}
}

public class Q104 {
public static void main(String[] args) {
	
	try {
		Candidate c = new Candidate("James", 20);
		Candidate c1=new Candidate("Williams", 32);
		System.out.println(c);
		System.out.println(c1);
	}
	  catch (MissingInfoException e2) {
		System.err.println("Dima 2nd exception");
			}
	  catch (AgeOutofRangeException e3) {
		  System.err.println("Dima 3rd exception");
			}
	catch (Exception e1) {
		System.err.println("Dima 1st exception");
			}

	
}
}




