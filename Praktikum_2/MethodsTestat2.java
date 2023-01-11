

public class MethodsTestat2
{//Fractionarray "Constructor"
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
    public static Fraction countNegatives(Fraction[]arr){
        int count = 0;
        for(Fraction frac:arr){
            if(frac.toDouble()<0){
                count++;
            }
        }
        return new Fraction(count,1);
    }
    
    public static Fraction sumUpNegatives(Fraction[]arr){
        Fraction sum = new Fraction();
        for(Fraction frac:arr){
            if(frac.toDouble()<0){
                sum = sum.add(frac);
            }
        }
        return sum;
    }
    
    public static Fraction maximum(Fraction[]arr){
        Fraction max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(max.toDouble() < arr[i].toDouble()){
                max = arr[i]; 
            }
        }
        return max;
    }
    
    public static Fraction countMaximum(Fraction[]arr){
        Fraction max = maximum(arr);
        int count = 0;
        for(Fraction frac:arr){
            if(frac.equals(max)){
                count++;
            }
        }
        return new Fraction(count,1);
    }
    
    public static boolean isSorted(Fraction[]arr){
        
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i].toDouble()>arr[i+1].toDouble()){
                return false;
            }
        }
        return true;
    }
    //Aufgabenstellung unklar
    public static Fraction[] increaseArray(Fraction[] arr, Fraction z){
        Fraction[] returnArray = new Fraction[arr.length];
        for(int i = 0; i<arr.length; i++){
            returnArray[i] = arr[i].add(z);
        }
        return returnArray;
    }
    
    public static Fraction[] doubleIfContainsPositive(Fraction[] arr){
        Boolean containsPositives = false;
        for(Fraction frac:arr){
            if(frac.toDouble() >= 0){
                containsPositives = true;
            }
        }
        
        for(int i = 0; i<arr.length && containsPositives;i++){
                arr[i] = arr[i].add(arr[i]);
        }
        return arr;
        
    }
    
    public static String toString(Fraction[]arr){
        String returnString = "";
        for(int i = 0; i<arr.length-1;i++){
            returnString += arr[i] + ", ";
        }
        
        return returnString + arr[arr.length-1];
    }
    
    public static Fraction[] selectNegatives(Fraction[]arr){
        Fraction[] returnArray = new Fraction[(int)countNegatives(arr).toDouble()];
        int index = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i].toDouble()<0){
                returnArray[index] = arr[i];
                index++;
            }
        }
        return returnArray;
    }
    
    public static Fraction countSequences(Fraction[]arr){
        int count = 0;
        for(int i = 0; i<arr.length-1;i++){
            if(arr[i].toDouble()!=0 && arr[i+1].toDouble()==0){
                count++;
            }
        }
        return new Fraction(count,1);
    }
}
