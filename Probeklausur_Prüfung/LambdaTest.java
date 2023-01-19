
public class LambdaTest{
    
    public static void test(){
        int[]testArr = {0,1,2,3,4,5,6,5};
        IntData val = new IntData(testArr);
        
        int w = 5;
        int count = val.compute((x,y)->(x==w), (p)->(1),w);
        int sum = val.compute((x,y)-> (x>w), (p)->(p*p), w);
        System.out.println("Count " + count);
        System.out.println("Sum: " + sum);
    }
    
    
    
}
