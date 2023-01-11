

public class Revision
{
    public Revision(){
    }
    
    public static Fraction maximum(Fraction[] arr, int i){
        if(arr.length<=0){
            return null;
        }
        if(i == 0){
            return arr[0];
        } else {
            if(arr[i].toDouble() > maximum(arr,i-1).toDouble()){
                return arr[i];
            }
            return maximum(arr,i-1);
        }
    }
    
    public static Fraction lastPositive(Fraction[]arr, int i){
        if(i==0){
            if(arr[i].toDouble() < 0){
                return null;
            }
            return arr[i];
        } else {
            if(arr[i].toDouble()<0){
                return lastPositive(arr,i-1);
            } 
            return arr[i];
        }
    }
    
    public static Fraction firstPositive(Fraction[]arr, int i){
        if(i==0){
            if(arr[i].toDouble()<0){
                return null;
            }
            return arr[i];
        } else {
            if(firstPositive(arr,i-1) == null  || firstPositive(arr,i-1).toDouble()<0){
                if(arr[i].toDouble()<0){
                    return null;
                }
                return arr[i];
            }
            return firstPositive(arr,i-1);
        }
    }
    
    public static boolean isSorted(Fraction[] arr, int i){
        if(i == 1){
            if(arr[i].toDouble() >= arr[i-1].toDouble()){
                return true;
            }
            return false;
        } else {
            if(arr[i].toDouble() >= arr[i-1].toDouble()){
                return isSorted(arr,i-1);
            }
            return false;
        }
    }
    
    public static boolean contains(Fraction[]arr, int i, Fraction x){
        if(i<0){
            return false;
        } else {
            if(arr[i].equals(x)){
                return true;
            }
            return contains(arr,i-1,x);
        }
    }
    
    public static int countPositives(Fraction[]arr, int d, int t){
        if(t<d){
            return 0;
        } else {
            if(arr[t].toDouble()>0){
                return 1 + countPositives(arr,d,t-1);
            }
            return countPositives(arr,d,t-1);
        }
    }
    
    public static boolean contentCheck(Fraction[]arr1, Fraction[]arr2, int i){
        if(i<0){
            return true;
        } else {
            if(arr1[i].equals(arr2[i])){
                return contentCheck(arr1,arr2,i-1);
            }
            return false;
        }
    }
    
    public static boolean palindromCheck(Fraction[]arr, int i){
        if(i>=arr.length){
            return true;
        } else {
            if(arr[arr.length-1-i].equals(arr[i])){
                return palindromCheck(arr,i+1);
            }
            return false;
        }
    }
    
   
    public static int getIndex(Fraction[]arr, int i, Fraction x){
        if(i==0){
            if(arr[i].equals(x)){
                return i;
            }
            return -1;
        } else {
            if(getIndex(arr,i-1,x)!= -1){
                return getIndex(arr,i-1,x);
            }
            if(arr[i].equals(x)){
                return i;
            }
            return -1;
        }
    }
    

    
}

