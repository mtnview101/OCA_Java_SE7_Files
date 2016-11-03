package core;

public class Q60 {
	public int getHash(){return 111111;}
	
	public static void main(String[] args) {
		Q60 sc, scA, scB;
		sc=new Q60();
		scA=new SampleClassA();
		scB=new SampleClassB();
		System.out.println("hash is: "+sc.getHash()+", "+scA.getHash()+", "+scB.getHash());
	}

}
class SampleClassA extends Q60{
	public int getHash() {return 44444444;}
}
class SampleClassB extends Q60{
	public long getHash() {return 99999999;} //The return type is incompatible with Q60.getHash()
}