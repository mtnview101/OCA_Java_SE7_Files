package core;

public class SB_apacity {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Dima");
	StringBuffer sbuf = new StringBuffer("Dima Nakhabtsev");
	int capacity=sb.capacity(), capacitybuf=sbuf.capacity();
	int count=sbuf.length();
	sbuf=sbuf.reverse();
	System.out.println(capacity+", "+capacitybuf+", "+count+", "+sbuf);
	
}
}
