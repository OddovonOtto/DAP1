
public class Main{
    
    public static void main(String args[]){
        
        int[] testArr = {8,2,3,4,5,6,7,8,9};
        char[] arr1 = {'c','b','c','c','b','a'};
        char[] arr2 = {'a','b','c','d','c','b','a'};
        
        System.out.println("Task 11:");
        //1
        System.out.println(digitSum(23396));
        //2
        //System.out.println(power(10,3));
        //3
        //System.out.println(sumUpNegatives(testArr,4);
        //4
        //System.out.println(countPositives(testArr, 4));
        //5
        //System.out.println(countPositivesLimited(testArr, 1, 5));
        //6
        //System.out.println(maximum(testArr,8));
        //7
        //System.out.println(isSorted(testArr, 8));
        //8
        //System.out.println(contains(testArr,8,-1));
        //9
        //System.out.println(contentCheck(arr1, arr2, 6));
        //10 incomplete
        //System.out.println(palindromCheck(arr2,6));
        //11
        //System.out.println(getIndex(testArr,8,8));
        //12
        //System.out.println(toString(testArr,9));
    
    }
    
    //1
    public static int digitSum(int n){
        if(n-10<0){
            return n;
        } else {
            return n%10 + digitSum(n/10);
        }
    }
    
    
    public static sumUp(int[] arr, int n){
    }
    //2
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        } else {
        
            return a * power(a, n-1);
        }
    }
    
    //3
    public static int sumUpNegatives(int[] arr, int n){
        if(n<0){
            return 0;
        } else{
            if(arr[n]<0){
                return arr[n] + sumUpNegatives(arr, n-1);
            }
            return sumUpNegatives(arr, n-1);
        }
    
    }
    
    //4
    public static int countPositives(int[] arr, int n){
        if(n<0){
            return 0;
        } else {
            if(arr[n]>0){
                return 1 + countPositives(arr, n-1);
            }
            return countPositives(arr, n-1);
        }
    }
    
    //5
    public static int countPositivesLimited(int arr[], int d, int t){
        if(t<d){
            return 0;
        } else {
            if(arr[t]>0){
                return 1 + countPositivesLimited(arr,d, t-1);
            }
            return countPositivesLimited(arr,d,t-1);
        }
    
    }
    
    //6
    public static int maximum(int[] arr, int i){
        if(i<0){
            return 0;
        } else {
            if(arr[i]> maximum(arr, i-1)){
                return arr[i];
            }
            return maximum(arr, i-1);
        }
    }
    
    //7
    public static boolean isSorted(int[] arr, int i){
        if(i==0){
            return arr[i+1]>arr[i];
        } else {
            if(arr[i-1]<arr[i]){
                return isSorted(arr, i-1);
            }
            return false;
        }
        
    }
    
    //8
    public static boolean contains(int[] arr, int i, int x){
        if(i == 0){
            return arr[i] == x;
        } else {
            if(arr[i] == x){
                return true;
            }
            return contains(arr,i-1,x);
        }
    }
    
    //9
    public static boolean contentCheck(char[] arr1, char[] arr2, int i){
        if(arr1.length != arr2.length){
            return false;
        }
        
        if(i == 0){
            return arr1[i] == arr2[i];
        } else {
            if(arr1[i] == arr2[i]){
                return contentCheck(arr1, arr2, i-1);
            }
            return false;
        }
    }
    
    //10
    public static boolean palindromCheck(char[] arr, int i){
        
        /*
        if(i == arr.length/2){
            if(arr.length%2== 0){
                return arr[i] == arr[arr.length-1-i];
            }
            return true;
            
        }else{
            if(arr[i]==arr[arr.length-1-i]){
                return palindromCheck(arr,i-1);
            }
            return false;
        }*/
        return palindromCheckBound(arr, i, i);
        
    }
    
    public static boolean palindromCheckBound(char[]arr, int i, int border){
        if(i==border/2){
            if(border%2 == 0){
                return arr[i] == arr[border-i];
            }
            return true;
        } else {
            if(arr[i] == arr[border-i]){
                return palindromCheckBound(arr,i-1,border);
            }
            return false;
        }
    }
    
    //11
    public static int getIndex(int[] arr, int i, int x){
        if(i<0 || i>= arr.length){
            return -1;
        }
        if(i == 0){
            if(arr[i] == x){
                return 0;
            }
            return -1;
        } else {
            if(arr[i] == x && i<getIndex(arr,i-1,x) 
            && getIndex(arr,i-1,x)!=-1){
                return i;
            }
            return getIndex(arr,i-1,x);
        }
    
    }
    
    //12
    public static String toString(int[] arr, int i){
        /*if(i==0){
            return ""+arr[i]+"";
        } else{
            return ""+arr[i]+""+toString(arr,i-1);
        }
        */
        if(i<0 || i >= arr.length){
            throw new IllegalStateException();
        }
        return toStringIO(arr,i,i);
    }
    
    public static String toStringIO(int[]arr, int i, int border){
        if(border-i == border){
            return ""+arr[border-i]+"";
        } else {
            return ""+arr[border-i]+""+toStringIO(arr,i-1,border);
        }
    }

}
