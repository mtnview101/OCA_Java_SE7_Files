package core;

public class Q96 {
	
	public static void main(String[] args)
	{
	    test(float[].class);
	    //test(String[].class);
	}

	static void test(Class clazz)
	{
	    System.out.println(clazz.getName());
	    System.out.println();
	    System.out.println(clazz.getSuperclass());
	    
	    //for(Class face : clazz.getInterfaces()) System.out.println(face);
	}
	
}

