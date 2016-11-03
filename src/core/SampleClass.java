package core;

class AnotherSampleClass extends SampleClass{}	

public class SampleClass {
		public static void main(String[] args) {
		
		SampleClass sc=new SampleClass();
		AnotherSampleClass asc=new AnotherSampleClass();
		
		sc=asc; System.out.println("sc class: "+sc.getClass()); System.out.println("asc class: "+asc.getClass());            
		
	}

}
