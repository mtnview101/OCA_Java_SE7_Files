package core;
import java.io.*;

public class Q136 {
public static void main(String[] args) {
	Q136 t=new Q136();
	try {
		t.doPrint();
		t.doList();
	
	} catch (Exception e) {
		System.out.println("Caught: "+e);
	}
	
}


public void doList() throws Exception{throw new Error("Error");}
public void doPrint() throws Exception{throw new RuntimeException("Exception");}



}

