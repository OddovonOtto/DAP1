package Poly2020_Selim;

public class Test {
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		All ref1 = new Most();
		Most ref2 = new Most();
		Most ref3 = new Normal();
		Normal ref4 = new Special();
		
		Top tu = new Upper();
		Upper um = new Middle();
		Middle mm = new Middle();
		Middle mb = new Bottom();
		
		tu.m(ref2); 
		tu.m(ref3); 
		um.m(ref1);
		um.m(ref4);
		mm.m(ref1);
		mm.m(ref2);
		mb.m(ref3);
		mb.m(ref4);
		
		//A A E P E L L P
		
	}

}
