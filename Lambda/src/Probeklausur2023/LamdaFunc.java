package Probeklausur2023;

public class LamdaFunc {
	
	public static void main(String[] args) {
		int[] test = {1,2,3,5,6,3,6};
		IntData toTest = new IntData(test);
		
		test(toTest,5);
	}
	
	public static void test(IntData id, int w) {
		int count = id.compute((x,y)->(x==y), (p)->1,w);
		System.out.println(count);
		
		int sum = id.compute((x,y)->(x>y), p->p*p, w);
		System.out.println(sum);
		
		sum = id.compute((x,y)->(x%y!=0), p->p,w);
		System.out.println(sum);
	}

}
