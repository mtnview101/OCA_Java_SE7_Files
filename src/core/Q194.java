package core;

	public class Q194 extends Sports {
		Q194() {
			super(11, "Cricket", "Condidtion OK"); 
			num_umpires =3; 
			num_substitutes=2;
		}
		int num_umpires;
		int num_substitutes;
		public static void main(String[] args) {
			Q194 cri=new Q194();
			System.out.println(cri.name);
		}
	}
	
	class Sports {
		int num_players;
		String name, ground_condition;
		Sports(int np, String sname, String sground){num_players = np;name = sname;	ground_condition = sground;}
		}