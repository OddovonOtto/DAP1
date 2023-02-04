package Iterator2018_1;

public class MultiSequence {
	private int[][] numbers;
	
	public MultiSequence(int[][] numbers) {
		this.numbers = numbers;
	}
	
	public MultiIterator iterator() {
		return new MultiIterator();
	}
	
	public class MultiIterator{
		private int dim1, dim2;
		
		public MultiIterator() {
			dim1 = 0;
			dim2 = 0;
		}
	
	public boolean hasNext() {
		if((dim1<numbers.length)) {
			return true;
		}
		return false;
	}
	
	public int next() {
		if(hasNext()) {
			int retVal = 0;
			if(dim2<numbers[dim1].length) {
				retVal = numbers[dim1][dim2];
				dim2++;
			}
			if(dim2>= numbers[dim1].length) {
				dim1++;
				dim2 = 0;
			}
			return retVal;
			
			
		} else {
			throw new IllegalStateException();
		}
	}

   }

}
