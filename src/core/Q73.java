package core;

class Q73 {
		static void one() {
		two();
		Q73.two();
		three(); //Cannot make a static reference to the non-static method three() from the type Q73
		Q73.four(); //Cannot make a static reference to the non-static method four() from the type Q73
		}
		static void two() { }
		
		void three() {
		one();
		Q73.two();
		four();
		Q73.four();//Cannot make a static reference to the non-static method four() from the type Q73
		//answer is: 5, 6, 13
		}
		
		void four() { }
}
