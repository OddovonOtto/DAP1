public class ArrayTest {
	
	public static void main(String[]args) {
		int[]arr = {1,2,1,1,1,1,1,1,2,1,1};
		System.out.println(contains(arr,2,5));
	}
	
	public static boolean contains(int[]arr, int n, int limit) {
		if(limit<0 || limit>=arr.length) {
			throw new IllegalArgumentException();
		} else {
			if(limit == 0) {
				return arr[0] == n;
			}
			
			if(arr[limit]==n) {
				return true;
			}
			return contains(arr,n,limit-1);
		}
	}

}