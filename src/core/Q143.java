package core;

public class Q143 {
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	
	System.out.println("before assignment s1:"+s1);
	System.out.println("before assignment s2:"+s2);
	System.out.println("before assignment s3:"+s3);
	System.out.println();
	/*
	s1=s3;
	s3=s2;
	s2=null;
	*/
	s1.equals(s3);
	s3.equals(s2);
	s2.equals(null);

	
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
	System.out.println("s3:"+s3);
	
}

}
