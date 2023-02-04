package Probeklausur2023;

public class Ints {
	
	private int[] numbers;
	
	public Ints(int[] p) {
		numbers = p;
	}
	
	public void show() {
		for(int i: numbers) {
			System.out.println(i);
		}
	}
	
	public void set(int index, int val) {
		if(index>=0 && index < numbers.length) {
			numbers[index] = val;
		}
	}
	
	public int count(int val) {
		int quantity = 0;
		for(int cand : numbers) {
			if(cand == val) {
				quantity++;
			}
		}
		return quantity;
	}
	
	public void substitute(int oldVal, int newVal) {
		for(int i = 0; i<numbers.length;i++) {
			if(numbers[i]==oldVal) {
				numbers[i] = newVal;
			}
		}
	}

}
