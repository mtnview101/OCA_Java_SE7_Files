package core;

public class Q164 {
static void doubling(Integer ref, int pv){ref=20; pv=20;System.out.println(ref+" "+pv);}

public static void main(String[] args) {
	Integer iObj=new Integer(10);
	int iVar=10;
	doubling(iObj++, iVar++);
	System.out.println(iObj+" "+iVar);

	Integer A=new Integer(10);
	Integer B=new Integer(100);
	Integer C;
	C=A-B;
	System.out.println("Integer C="+C);
}
}
