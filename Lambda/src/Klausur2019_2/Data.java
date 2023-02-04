package Klausur2019_2;

public class Data {
	
	private int[] values;
	
	public Data(int[] p) {
		values = p;
	}
	
	public int action(IntFunc f, IntFunc g) {
		int result = 0;
		for(int i = 0; i < values.length; i++){
			if(f.compute(i)>0) {
				result = result + g.compute(values[i]);
			}
		}
		return result;
	}

}
