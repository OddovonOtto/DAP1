package Poly2018_1;

public class Test {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		All all = new All();
		Most most = new Most();
		Special special = new Special();
		
		Top x = new Middle();
		Top y = new Bottom();
		Middle z = new Bottom();
		
		
		x.m(most);
		x.m(special);
		y.m(all);
		y.m(special);
		z.m(all);
		z.m(most);
		
		//M M M M M M
	}

}
