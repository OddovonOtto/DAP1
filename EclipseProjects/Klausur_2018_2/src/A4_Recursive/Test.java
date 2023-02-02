package A4_Recursive;

public class Test {
	
	public static void main(String[] args) {
		int[] tArr1 = {1,2,3,4,5,6};
		int[] tArr2 = {7,8,9,10};
		System.out.println(allGreater(tArr1,tArr2,0));
		
	}
	
	public static boolean allGreater(int[] arr1, int[] arr2, int i) {
		if(arr1.length == 0 || arr2.length == 0 ) {
			return true; 
		}else {
			if(i<arr1.length&& i< arr2.length) {
				if(arr1[i]<=arr2[i]){
					return false;
				}
				return allGreater(arr1,arr2,i+1);
			}else {
				return true;
			}
		}
	}

}
