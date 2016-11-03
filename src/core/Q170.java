package core;

public class Q170 {
int num;


public static void main(String[] args) {
	System.out.println("Dima");
Q170 obj1 = new Q170();
Q170 obj2 = obj1;
obj1 = null;
obj2.num = 60;

graceMarks(obj2);
System.out.println(obj1);
System.out.println(obj2);
//System.out.println(obj3);

}
public static void graceMarks(Q170 obj4) {obj4.num += 10; System.out.println("obj4: "+obj4);}
}
