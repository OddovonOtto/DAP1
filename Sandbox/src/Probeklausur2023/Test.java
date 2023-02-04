package Probeklausur2023;

public class Test {
	
	public static void main(String[] args) {
		
		task3();
	}
	
	public static void task3() {
		int[] test = {1,2,3,4,5,6,7,2,3,3,4,4};
		int[] test2 = {1,2,0,0};
		int[] test3 = {9,8,7,2};
		Ints toTest = new Ints(test);
		Ints toTest2 = new Ints(test2);
		Ints toTest3 = new Ints(test3);
		
		Ints[] storageTest = {toTest, toTest2, toTest3};
		
		Storage s = new Storage(storageTest);
//		toTest.set(-1,90);
//		toTest.set(0, 99);
//		toTest.show();
//		
//		System.out.println(toTest.count(4));
//		
//		toTest.substitute(4, 1);
//		toTest.show();
		
		System.out.println(s.contains(100));
		System.out.println(s.allAround(2));
		
	}

}
