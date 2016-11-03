package core;

public class Alpha1 {
public String[] main=new String[2];

Alpha1(String[] main){
						System.out.println("main.length: "+main.length);
						for(int ii=0;ii<main.length;ii++){
						this.main[ii]=main[ii]+5;}
					 }
					
public void main(){System.out.println(main[0]+main[1]);};
}
