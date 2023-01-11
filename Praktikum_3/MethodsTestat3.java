public class MethodsTestat3
{
/*
    public static int digitSum( int n ) 
    {
        n = Math.abs( n );
        if ( n < 10 )
        {
            return n;
        }
        else
        {
            return n % 10 + digitSum( n/10 );
        }
    }

    public static int power( int a, int n )
    {
        if ( n < 0 || a == 0)
        {
            return 0;
        }
        else 
        {
            if ( n == 0 )     // Abbruchbedingung
            {
                return 1;
            }
            else            // rekursiver Aufruf
            {
                return a * power( a, n-1 );
            }
        }
    }

    public static int sumUpNegatives( int[] arr, int n )
    {     
        if ( n<0 || n>=arr.length )       
        {
            return 0; 
        }
        else
        {
            if ( n == 0 )
            { 
                if ( arr[0] < 0 )
                {
                    return arr[0];
                } 
                else 
                {
                    return 0;
                }
            }
            else
            {
                if ( arr[n] < 0 )
                {
                    return arr[n] + sumUpNegatives( arr, n-1 );
                } 
                else 
                {
                    return sumUpNegatives( arr, n-1 );
                }
            }
        }
    }
    
    public static int countPositives( int[] arr, int n )
    {     
        if ( n<0 || n>=arr.length )       
        {
            return 0; 
        }
        else
        {
            if ( n == 0 )
            { 
                if ( arr[0] > 0 )
                {
                    return 1;
                } 
                else 
                {
                    return 0;
                }
            }
            else
            {
                if ( arr[n] > 0 )
                {
                    return 1 + countPositives( arr, n-1 );
                } 
                else 
                {
                    return countPositives( arr, n-1 );
                }
            }
        }
    }

    public static int countPositivesLimited(int[] arr, int d, int t)
    {     
        if ( d<0 || d > t || t>=arr.length )       
        {
            throw new RuntimeException(); 
        }
        else
        {
            if (t==d)
            { 
                if ( arr[d] > 0 )
                {
                    return 1;
                } else {
                    return 0;
                }
            }
            else
            {
                if ( arr[t] > 0 )
                {
                    return 1 + countPositivesLimited( arr, d, t-1 );
                } else {
                    return countPositivesLimited( arr, d, t-1 );
                }
            }
        }
    }

    public static int maximum( int[] arr, int i )
    {
        if ( i<0 || i>=arr.length ) 
        {
            throw new RuntimeException(); 
        }        
        if ( i == 0 )
        {
            return arr[0];   
        }
        else
        {
            int max = maximum( arr, i-1 );
            if ( arr[i] > max ) 
                return arr[i];
            else
                return max;
        }
    }    

    public static boolean isSorted( int[] arr, int i )
    {        
        if ( i<0 || i>=arr.length ) 
        {
            throw new RuntimeException(); 
        } 
        else
        {
            if ( i == 0 )
            {
                return true;    // gibt auch true zurueck fuer Felder der Laenge 1
            }
            else
            {
                return arr[i-1] < arr[i] && isSorted( arr,i-1 );
            }
        }
    }

    public static boolean contains( int[] arr, int i, int x )
    {     
        if ( i<0 || i>=arr.length ) 
        {
            throw new RuntimeException(); 
        }
        else
        {
            if (i==0)
            { 
                return ( arr[0]==x );
            }
            else
            {
                return arr[i]==x || contains( arr, i-1, x );
            }
        }
    }

    public static boolean contentCheck( char[] arr1, char[] arr2, int i )
    {
        if ( i<0 || i>arr1.length-1 || i>arr2.length-1 )
        {
            throw new RuntimeException(); 
        }
        else
        {
            if ( i==0 )
            {
                return arr1[0] == arr2[0];   
            }
            else
            {
                if (arr1[i] != arr2[i])
                {
                    return false;   
                }
                else
                {
                    return contentCheck( arr1, arr2, i-1 );   
                }
            }     
        }
    }    

    public static boolean palindromCheck( char[] arr, int i )
    {
        if ( i<0 || i>arr.length-1 )
            return false;
        else
        {
            int j=arr.length-1-i; /* linker Index *//*
            if ( i <= j )
            {
                return true;
            }
            else
            {
                return arr[i] == arr[j] && palindromCheck( arr, i-1 );
            }
        }
    }  

    public static int getIndex( int[] arr, int i, int x )
    {
        if ( i < 0 || i>arr.length-1 )
        {
            return -1;
        }
        else
        {
            int lower = getIndex( arr, i-1, x );
            if ( lower != -1 || arr[i] != x )
            {
                return lower;
            }
            else
            {
                return i;
            }
        }
    }

    public static String toString( int[] arr, int i )
    {
        if ( i < 0 || i >= arr.length )
        { 
            return "";
        }
        else
        {
            if ( i == 0 )
            {
                return arr[0] + "";
            }
            else
            { 
                return toString( arr, i-1 ) + "," + arr[i];
            }
        }
    }
    */
   
   //1
    public static int digitSum(int n){
        if(n-10<0){
            return n;
        } else {
            return n%10 + digitSum(n/10);
        }
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
                return i;
            }
            return -1;
        } else {
            if(arr[i] != x || getIndex(arr,i-1,x)!=-1){
            return getIndex(arr,i-1,x);
            } else{
                return i;
            }
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
            return ""+arr[border-i]+","+toStringIO(arr,i-1,border);
        }
    }
   
}

    