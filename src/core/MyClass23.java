package core;

	public class MyClass23 {
	    static int var=201;
	    public static void main(String[] args) {
	        int var = 9;
	        printVar(); }
	    public static void printVar() {
	        //int var = 10;
	        System.out.print("var = " + var++); }
	                            
		
		
		/*
	    static int var=201;
	
	    public void printVar(int var) {
        System.out.print("var = " + var++); 
        System.out.println("; from printVar() this.var=>"+this.var);}    
    
    
	    public static void main(String[] args) {
        //System.out.println("static int var=>"+var);//Cannot make a static reference to the non-static field var
        
        MyClass23 a=new MyClass23();
        a.printVar(1001);
        }*/
	                            }