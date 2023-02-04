package Quicksort;

public class Quicksort {
	
	public static void main(String[] args) {
		
		int[] s = {4,17,9,38,25,20,8,12,15};
		groupByNumber(s, 0, s.length-1);
		
		for(int val: s) {
			System.out.println(val);
		}
		
	}
	
	

    public static void groupByNumber(int[] arr, int leftBound, int rightBound ){
        if (leftBound < rightBound ){
        	
        	System.out.println("Pivot: " + arr[rightBound]);
            
        	int leftOfGreaterPart = leftBound; 

            for ( int candidate = leftBound; candidate < rightBound; candidate++ ){
                
            	if (arr[rightBound]>arr[candidate]){
                	
                    swapNumb(arr,candidate, leftOfGreaterPart );
                    leftOfGreaterPart++;
                }
            }

            swapNumb( arr,leftOfGreaterPart, rightBound );

            groupByNumber( arr,leftBound, leftOfGreaterPart - 1 );
            groupByNumber( arr,leftOfGreaterPart + 1 , rightBound );
        }
    }
    
    private static void swapNumb(int[] arr, int i, int j ){
        if ( i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
