package Iterator2018_1;

import Iterator2018_1.MultiSequence.MultiIterator;

public class IteratorTest {

	public static void main(String[] args) {
		int[][] matrix = new int[3][5];
		matrix[0][0] = 1;matrix[0][1] = 2;matrix[0][2] = 3;matrix[0][3] = 4;matrix[0][4] = 5; 
		matrix[1][0] = 1;matrix[1][1] = 2;matrix[1][2] = 3;matrix[1][3] = 4;matrix[1][4] = 5;
		matrix[2][0] = 1;matrix[2][1] = 2;matrix[2][2] = 3;matrix[2][3] = 4;matrix[2][4] = 5;
		MultiSequence m = new MultiSequence(matrix);
		MultiIterator it = m.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
