public class Main{
    
    public static void main(String[] args){
        int[] testArr = {0,1,2,3,4,5,6,7,10};
        int[] testArr2 = {0,1,2,3,4,5,6,7};
        Ints i = new Ints(testArr);
        Ints i2 = new Ints(testArr);
        Ints i3 = new Ints(testArr2);
        Ints[] intsArr = {i,i2,i3,null,null,i,i2,null};
        
        for(Ints val : intsArr){
            System.out.println(val);
        }
        
        compress(intsArr);
        
        for(Ints val : intsArr){
            System.out.println(val);
        }
        
    }
    
    public static void compress(Object[]arr){
        int positionNextNull = 0;
        int positionNextObject = 0;
        while(positionNextNull < arr.length && positionNextObject < arr.length){
            if(arr[positionNextNull]!=null){
                positionNextNull++;
            } else {
                if(positionNextObject < positionNextNull || arr[positionNextObject]==null){
                positionNextObject++;
                } else {
                    arr[positionNextNull] = arr[positionNextObject];
                    arr[positionNextObject] = null;
                }
            }
        }
    }
}
