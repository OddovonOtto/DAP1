

public class Testat
{
    public static Fraction apply(Fraction[]arr, Fraction x){
        if(arr.length<4){
            return new Fraction(1,1).subtract(x.multiply(new Fraction(1,2)));
        } else {
            return arr[0].multiply(arr[arr.length-1]);
        }
    }
}
