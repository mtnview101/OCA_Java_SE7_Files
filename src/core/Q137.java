package core;

public class Q137 {
public static void main(String[] args) {
	float myarray[]={10.20f,20.3f,30.4f,50.4f};
	int index=0;
	boolean isFound=false;
	float key=30.4f;
	
	// NO while(key==myarray[index++]){isFound=true;}
	while(index<5){
		if(key==myarray[index]){isFound=true; break;}
		index++;
	}
	
	System.out.println(isFound);
}
}
