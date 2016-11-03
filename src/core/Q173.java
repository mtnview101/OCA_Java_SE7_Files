package core;

	public class Q173 extends Base{
	public static void main(String[] args) {
	Q173 obj = new Q173();
	obj.setNum(3);
	System.out.println("Square = " + obj.getNum() * obj.getNum());
	}
	}

	class Base {
		/*B-->NO
		public int num; 
		protected public int getNum() { return num; } //The method getNum in type Base can only set one of public / protected / private
		protected public void setNum(int num) { this.num = num;}
		*/
		/*A --> Yes
		private int num; 
		public int getNum() { return num; }
		public void setNum(int num) { this.num = num;}
		*/
		//D --> Yes
		protected int num; 
		public int getNum() { return num; } 
		public void setNum(int num) { this.num = num;}
		
		/*E --> NO
		protected int num; 
		private int getNum() { return num; } 
		public void setNum(int num) { this.num = num;}
		*/
		/*C --> NO
		private int num;
		public int getNum() {return num;} 
		private void setNum(int num) { this.num = num;}
		*/
		}