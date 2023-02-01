package Poly2019_2;

public class Test {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		All all = new Most();
		Most most = new Most();
		Normal normal = new Special();
		Special special = new Special();
		
		Top tu = new Upper();
		Upper um = new Middle();
		Middle mm = new Middle();
		Middle mb = new Bottom();
		
		tu.m(most); 
		tu.m(special); 
		um.m(normal);
		um.m(special);
		mm.m(normal);
		mm.m(special);
		mb.m(all);
		mb.m(normal);
		
		//A B X B X B E X
		
	}

}
