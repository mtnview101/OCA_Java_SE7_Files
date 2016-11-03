package core;

public class Q102 {
int fvar;
static int cvar;
public static void main(String[] args) {
	Q102 t=new Q102();
	t.fvar=200; //A
	cvar=400; //B
	//fvar=200; //D
	//cvar=400;
	t.fvar=200; //E
	Q102.cvar=400;
	//this.fvar=200; //F
	//Q102.cvar=400;
	
	
}
	
}
