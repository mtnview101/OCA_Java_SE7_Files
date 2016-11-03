package core;

public class Q207 {
public static void main(String[] args) {
	for (int ii = 0; ii < 3;ii++) {System.out.print("ii="+ii);System.out.println(" ---------------------------");
		int count = 0;
		for (int jj = 3; jj > 0; jj--) {System.out.print(" jj="+jj);
		if (ii == jj) {	++count;break;}
		}
		System.out.println(" count=>"+count);
		continue;
		}
}
}
