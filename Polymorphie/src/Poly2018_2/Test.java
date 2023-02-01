package Poly2018_2;

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
		Top tm = new Middle();
		Middle mm = new Middle();
		Middle mb = new Bottom();
		
		tu.m(most); 
		tu.m(special); 
		tm.m(normal);
		tm.m(special);
		mm.m(normal);
		mm.m(special);
		mb.m(most);
		mb.m(normal);
		
		//A A A A T T X T
	}

}
