

public class Main{
    public static void main(String[] args){
        int[] testArr = {-1,2};
        int[] testArr2 = {2,3,2,3,5,5,3,3,9,9};
        int[] testArr3 = {2,3,4,3,7,7,4,1,2,1};
        System.out.println(twoTimes(testArr2));
    }
    
    public static int countNegatives(int[] arr){
        int count = 0;
        for(int value:arr){
            if(value <0){
                count++;
            }
        }
        return count;    
    }
    
    public static int sumUpNegatives(int[] arr){
        int sum = 0;
        for(int value:arr){
            if(value <0){
                sum += value;
            }
        }
        return sum;
    }
    
    public static int maximum(int[] arr){
        int maxValue = arr[0];
        for(int value:arr){
            if(value>maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    public static int countMaximum(int[]arr){
        int maxValue = arr[0];
        int count = 0;
        
        for(int value:arr){
            if(value>maxValue){
                maxValue = value;
            }
        }
        for(int value:arr){
            if(value==maxValue){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isSorted(int[] arr){
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkArray(int[]arr){
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!= arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
    
    public static int[] increaseArray(int[]arr, int z){
        int[] returnArray = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            returnArray[i] = arr[i]+z;
        }
        return returnArray;
    }
    
    public static int[] doubleIfContainsPositive(int[]arr){
        int[] returnArray = new int[arr.length];
        boolean containsPositive = false;
        for(int value:arr){
            if(value >= 0){
                containsPositive = true;
            }
        }
        if(containsPositive){
            for(int i = 0; i<arr.length;i++){
                returnArray[i] = arr[i]*2;
            }
        }
        return returnArray;
    }
    
    public static String toString(int[] arr){
        if(arr.length == 0){
            return "Array is Empty";
        }
        String returnString = "";
        for(int i = 0; i<arr.length-1;i++){
            returnString += arr[i] +",";
        }
        return returnString + arr[arr.length-1];
    }
    
    public static int[] copyStartingValues(int[] arr){
        if(arr.length >2){
           int[] returnArr = new int[3];
           for(int i = 0; i < returnArr.length; i++){
               returnArr[i] = arr[i];
            }
            return returnArr;
        }
        int [] returnArray = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            returnArray[i] = arr[i];
        }
        return returnArray;
    }
    
    public static int[] selectNegatives(int[]arr){
        int[] returnArray = new int[countNegatives(arr)];
        int index = 0;
        for(int value: arr){
            if(value<0){
                returnArray[index] = value;
                index++;
            }
        }
        return returnArray;
    }
    
    public static int[] copyAndInvert(int[] arr){
        int[] returnArr = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            returnArr[i] = arr[arr.length-1-i];
        }
        return returnArr;
    }
    
    public static int[] addArrays(int[] arr1, int[] arr2){
        int[] returnArray = {};
        if(arr1.length==arr2.length){
            returnArray = new int[arr1.length];
            for(int i = 0; i<returnArray.length; i++){
                returnArray[i] = arr1[i]+arr2[i];
            }
        }
        return returnArray;
    }
    /*
    public static int countSequences(int[] arr){
        int returnValue = 0;
        for(int value)
    }
    */
    public static boolean twoTimes(int[] arr){  
      int index = 0;
      for(int value: arr){
          int count = 0;
          for(int sValue:arr){
              if(sValue == value){
                  count++;
                }
            }
          if(count != 2){
              return false;
            }
        }
        return true;      
    }
}
