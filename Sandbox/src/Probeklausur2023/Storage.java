package Probeklausur2023;

public class Storage {

	private Ints[] values;
	
	public Storage(Ints[] i) {
		values = i;
	}
	
	public boolean contains(int p) {
		for(Ints cand : values) {
			int c = cand.count(p);
			if(c>0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean allAround(int p) {
		for(Ints cand:values) {
			if(cand == null) {
				return false;
			}
			
			int c = cand.count(p);
			if(c<=0) {
				return false;
			}
		}
		return true;
	}
}
