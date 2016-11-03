package core;

public class Test extends SuperTest
{
    static { System.out.print("2"); }
    { System.out.print("5"); }    
    public Test() { System.out.print("6"); }

    public static void main(String[] args) { new Test(); }
}
