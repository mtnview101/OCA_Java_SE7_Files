package core;

public class loop {
	public static void main(String[] args) {
	int age = 22;
	if (age <= 20 && age >= 13) System.out.println("You're teenager"); else if (age <= 45 && age >= 21 ) 
	System.out.println("You're adult"); else System.out.println("Undefined age");
//------------------------------------------------------------------------------------------------------
	  switch(age){
	  case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: System.out.println("Operatoe switch: You're teenager"); break;
	  case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: 
	  case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: 
	  case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: 
	  case 45: System.out.println("Operatoe switch: You're adult"); break;
	  default: System.out.println("Operatoe switch: Undefined age");}

	
	
}}
