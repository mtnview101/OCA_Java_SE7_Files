package core;

//=======================================QUESTION 12=============================================

public class X { 
String str="default";
X(String s){str=s;}
void print(){System.out.println(str);}

public static void main(String[] args){
	new X("Dima").print();
}
}
