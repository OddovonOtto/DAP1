
public class Main{
    
    public static void main(String[] args){
        
        int[] intArr = {-1,10,-1,4,-3,8,-6,7,-99,100,-3,8,-1,8,-1,10};
        int[] intArr2 = {1,1,2,1,3,1,3,1,2,1,1,1};
        int[] intArr3 = {-2,1,3,1,-4,1,5,1,6,1,-2,1,-8,1};
        int[] intArr4 = {2,1,3,1,4,1,5,1,6,1,6,1,8,1};
        Fraction[] testArr = createFractionArr(intArr3);
        Fraction[] testArr2 = createFractionArr(intArr2);
        
        for(Fraction fraction:testArr){
            System.out.println(fraction);
        }
        
        Revision testClass = new Revision();
        
        
        //System.out.println("Biggest: "+testClass.maximum(testArr,5));
        //System.out.println("firstPositive "+testClass.firstPositive(testArr,7));
        //System.out.println("isSorted: " + testClass.isSorted(testArr,6));
        //System.out.println("contains: " + testClass.contains(testArr,6,new Fraction (7,1)));
        //System.out.println("countPositives:" + testClass.countPositives(testArr2,2,5));
        //System.out.println("contentCheck: " + testClass.contentCheck(testArr, testArr2, 4));
        System.out.println("palindromCheck: " + testClass.palindromCheck(testArr2,0));
        //System.out.println("getIndex: " + testClass.getIndex(testArr2,6,new Fraction(2,1)));
    }
    
    public static Fraction[] createFractionArr(int[]arr){
        int index = 0;
        Fraction[] returnArray = new Fraction[arr.length/2]; 
        for(int i=0; i<arr.length;i+=2){
            returnArray[index] = new Fraction(arr[i],arr[i+1]);
            index++;
        }
        return returnArray;
    }
    
    //1
    public static Fraction maximum(Fraction[]arr, int i){
        return maximum(arr,i,i);
    }
    
    public static Fraction maximum(Fraction[]arr, int i,int biggestPos){
        if(arr.length == 0){
            return null;
        }
        if(i==0){
            if(arr[0].toDouble()>arr[1].toDouble()){
                return arr[0];
            } else{
                return arr[biggestPos];
            }
        } else {
            if(arr[i].toDouble()>arr[biggestPos].toDouble()){
                return maximum(arr,i-1,i);
            } else{
                return maximum(arr,i-1,biggestPos);
            }
            
        }
            
    }
    //2
    public static Fraction lastPositive(Fraction[]arr,int i){
        if(i==0){
            if(arr[0].toDouble()>=0){
                return arr[0];
            } else {
                return null;
            }
        } else {
            if(arr[i].toDouble()>=0){
                return arr[i];
            } else {
                return lastPositive(arr, i-1);
            }
        }
    }
    //3
    public static Fraction firstPositive(Fraction[]arr, int i){
        return firstPositive(arr, 0,i);
    }
    
    public static Fraction firstPositive(Fraction[]arr,int i,int border){
        if(i==border){
            if(arr[i].toDouble()>=0){
                return arr[0];
            } else {
                return null;
            }
        } else {
            if(arr[i].toDouble()>=0){
                return arr[i];
            } else {
                return firstPositive(arr, i+1,border);
            }
        }
    }
    //4
    public static boolean isSorted(Fraction[]arr, int i){
        if(i == 1){
            if(arr[0].toDouble()<arr[i].toDouble()){
                return true;
            }
            return false;
        } else {
            if(arr[i-1].toDouble()<=arr[i].toDouble()){
                return isSorted(arr,i-1);
            }
            return false;
        }
    }
    //5
    public static boolean contains(Fraction[]arr, int i, Fraction x){
        if(i==0){
            if(x.equals(arr[i])){
                return true;
            }
            return false;
        } else {
            if(x.equals(arr[i])){
                return true;
            } else {
                return contains(arr, i-1,x);
            }
        }
    }
    //6
    public static int countPositives(Fraction[] arr, int d, int t){
        if(d==t){
            if(arr[d].toDouble()>0){
                return 1;
            }
            return 0;
        } else {
            if(arr[d].toDouble()>0){
                return countPositives(arr,d+1,t)+1;
            }
            return countPositives(arr,d+1,t);
        }
    }
    //7
    public static boolean contentCheck(Fraction[]arr1, Fraction[]arr2, int i){
        if(i==0){
            if(arr1[i].equals(arr2[i])){
                return true;
            } 
            return false;
        } else {
            if(arr1[i].equals(arr2[i])){
                return contentCheck(arr1,arr2,i-1);
            }
            return false;
        }
    }
    
    //8
    public static boolean palindromCheck(Fraction[]arr, int i){
        return palindromCheck(arr,0,i);
    }
    
    public static boolean palindromCheck(Fraction[]arr, int i, int border){
        if(i==border){
            if(arr[i].equals(arr[border-i])){
                return true;
            }
            return false;
        } else {
            if(arr[i].equals(arr[border-i])){
                return palindromCheck(arr,i+1,border);
            }
            return false;
        }
    }
    
    public static int getIndex(Fraction[] arr, int i, Fraction x){
        if(i<0 || i>=arr.length){
            return -1;
        }
        return getIndex(arr,0,x,i);
        }
    
    public static int getIndex(Fraction[] arr, int i, Fraction x, int border){
        if(i == border){
            if(arr[i].equals(x)){
                return i;
            }
            return -1;
        } else {
            if(arr[i].equals(x)){
                return i;
            } 
            return getIndex(arr,i+1,x,border);
        }
    
    }
    
}

