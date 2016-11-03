package core;
// This an example of OVERRIDING --> override — переопределять
class HappyMan {
	   public void BeHappy() {
	      System.out.println("Happy man starts to have $100 per hour");
	   }
	}

	class Stoma extends HappyMan {
	   public void BeHappy() {
	      System.out.println("Starts to go to SF college");
	   }
	}

	class Nakhabtsev extends HappyMan {
		   public void BeHappy() {
		      System.out.println("Starts to go to Microsoft in Mountain View");
		   }
		}
	
	class Khatilov extends HappyMan {
		   public void BeHappy() {
		      System.out.println("Starts to go to Belorus");
		   }
		}
	
	public class TestMan {

	   public static void main(String args[]) {
	      HappyMan man = new HappyMan();   // HappyMan reference and object
	      HappyMan andrei = new Stoma();   // HappyMan reference but Stoma object
	      HappyMan natasha = new Stoma();   // HappyMan reference but Stoma object
	      HappyMan dmitry = new Nakhabtsev();   // HappyMan reference but Nakhabtsev object
	      HappyMan marina = new Nakhabtsev();   // HappyMan reference but Nakhabtsev object
	      HappyMan alex = new Khatilov();   // HappyMan reference but Khatilov object

	      man		.BeHappy();   // runs the method in HappyMan class
	      andrei	.BeHappy();   // runs the method in Stoma class
	      natasha	.BeHappy();   // runs the method in Stoma class
	      dmitry	.BeHappy();   // runs the method in Nakhabtsev class
	      marina	.BeHappy();   // runs the method in Nakhabtsev class
	      alex		.BeHappy();   // runs the method in Khatilov class
	   }
	}
