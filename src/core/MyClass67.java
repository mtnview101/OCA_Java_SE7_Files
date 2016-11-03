package core;


	public class MyClass67 {
	    private static final Object Dima = null;

		public MyClass67(Object obj) {if (obj == null) throw new IllegalArgumentException("Provide an object!"); System.out.println(obj + " created!");}
	    
	    public static void createObject() { try {MyClass67 obj = new MyClass67(Dima);} finally {System.out.println("Was the object created?");}}
	    
	        public static void main(String[] args) {
	        	        createObject();
	       }
	}
