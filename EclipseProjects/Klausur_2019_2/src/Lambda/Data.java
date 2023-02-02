package Lambda;

public class Data {
	
private int[] iValues;

public Data(int[]p) {
	iValues = p;
}

public int act(IntFunc f, IntIntFunc g) {
	int result = 0;
	int i = f.apply(-1);
	while(i>=0 && i < iValues.length) {
		result = g.apply(iValues[i], result);
		i = f.apply(i);
		}
	return result;
	}
}
