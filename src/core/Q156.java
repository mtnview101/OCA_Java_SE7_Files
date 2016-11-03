package core;

public class Q156 {
public static void main(String[] args) {
	Z obj=new Z();
	System.out.println(obj.x3+" "+obj.y1+" "+obj.x1);
}
}

class XXXX{
	int x1,x2,x3;
}

class YYYY extends XXXX{
	int y1;
	YYYY(){x1=1; x2=2; y1=10;}
}

class Z extends YYYY{
	int z1;
	Z(){ x2=3; y1=20; z1=100;}
}