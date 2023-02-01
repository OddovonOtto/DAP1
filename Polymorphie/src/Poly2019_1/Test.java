package Poly2019_1;

public class Test {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		All all = new Most();
		Most most = new Most();
		Normal normal = new Special();
		Special special = new Special();
		
		Top tm = new Middle();
		Upper um = new Middle();
		Middle mm = new Middle();
		Middle mb = new Bottom();
		
		tm.m(most); 
		tm.m(special); 
		um.m(normal);
		um.m(special);
		mm.m(normal);
		mm.m(special);
		mb.m(most);
		mb.m(normal);
		
		// A B B X B X E L
	}

}
