package core;

import java.util.ArrayList;
import java.util.List;

class StudentT {
		int rollnumber;
		String name;
		List cources = new ArrayList();
		StudentT(int i, String string, List cs) {rollnumber=i;name=string;cources=cs; }

		public String toString() {return rollnumber + " : " + name + " : " + cources;}
		}

		public class Q208 {
		public static void main(String[] args) {
		List cs = new ArrayList();
		//System.out.println(cs.getClass());
		cs.add("Java");
		cs.add("C");
		System.out.println(cs);
		StudentT s = new StudentT(123,"Fred", cs);
		System.out.println(s);
		}
		}
