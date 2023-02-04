package Klausur2019_2;

public class Lambda_Func {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,0,0,0,0};
		Data d = new Data(arr);
		test(d,3);
	}
	
	public static void test(Data d, int y) {
		int print = d.action(x -> 1, x->{if(x!=0){return 1;}return 0;});
		System.out.println("A1: " + print);	
		
		print = d.action(x->{if(x%2==0) {return 0;}return 1;}, x->x);
		System.out.println("A2: " + print);
		
		print = d.action(x->1, x->{if(x>0){return 1;}return -1;});
		System.out.println("A3: " + print);
		
		print = d.action(p->{if(p==y) {return 1;}return 0;}, x -> x);
		System.out.println("A4: " + print);
		
		print = d.action(x->1, x->1);
		System.out.println("A5: " + print);
	}
	

}
