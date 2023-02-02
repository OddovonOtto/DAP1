package Poly2017;

public class Test {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		All all = new All();
		Most most = new Most();
		Special special = new Special();
		
		Top tm = new Middle();
		Top tb = new Bottom();
		Middle mm = new Middle();
		Middle mb = new Bottom();
		
		
		tm.m(special);
		tm.m(most);
		tb.m(most);
		tb.m(special);
		mm.m(new Special());
		mm.m(most);
		new Bottom().m(all);
		mb.m(special);
		
		//L P P Z L P O Z 
	}

}
