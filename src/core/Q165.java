package core;
class Mid{
	public int findMid(int n1,int n2){
	return(n1+n2)/2;}}

public class Q165 extends Mid{
	public static void main(String[] args) {
		int n1=22,n2=2;
		
		Q165 c=new Q165();
		int n3=c.findMid(n1, n2);
		
		//Mid m1=new Q165();
		//int n3=m1.findMid(n1, n2);
		
		//Q165 m1=new Mid(); NO
		//int n3=m1.findMid(n1, n2);
		
		//NO int n3=Q165.findMid(n1,n2);
		
		System.out.println(n3);
	}

}


