package core;

public class Employee {
	public String name; //instance variable
	public Employee(String n){name=n;} //constructor
	public void printName(){System.out.println(name);}
	
	public static void main(String[] args) {
		Employee e=new Employee("Dima Nakhabtsev"); //object instantiation
		e.printName(); //printing object using Instance method
		
		//System.out.println(name); //Cannot make a static reference to the non-static field name
		//String check=new String();		
		//check=e.name;
		//System.out.println("e.name: "+check);	
	}
	
	
	

}
