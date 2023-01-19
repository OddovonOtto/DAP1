
public class Recursion{
    
    
    public static void test(){
        //int[] testArray = {1,0,2,0,3,4,5,6};
        //System.out.println(contains(testArray,2,testArray.length-1));
        
        dimensionTest();
    }
    
    public static boolean contains(int[] arr, int n, int limit){
        if(limit <0 || limit >= arr.length){
        throw new IllegalArgumentException();
    } else {
        /*
        if(limit == 0){
            if(arr[0]==n){
                return true;
            }
            return false;
        } else {
            if(arr[limit] == n){
                return true;
            }
            return contains(arr, n, limit-1);
        }
       */
      
      if(arr[limit]==n){
          return true;
        }else {
            if(limit == 0){
                return false;
            }else {
                return contains(arr,n,limit-1);
            }
        }
      
      
    }
    }
    
    public static void dimensionTest(){
        int[] testArr1 = {1,2,3};
        int[] testArr2 = {1,2,3,1};
        int[] testArr3 = {1,2,3,1};
        int[] testArr4 = {1,2,3,1};
        int[] testArr5 = {1,2,3,1};
        int[][] dim = {testArr1,testArr2,testArr3,testArr4,testArr5};
        
        System.out.println(dim[0].length);
    }
    
}
