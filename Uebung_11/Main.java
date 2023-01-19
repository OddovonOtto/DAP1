
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main{
    public static void main(String[] args){
            testLambda();
    }
    
    public static void testLambda(){
        int[] test = {1,2,21,22,32,14,-10,11};
        IntValues iv = new IntValues(test);
        int result = iv.compute(p->p,p->{if(p==0){return false;}return true;});
        int gzz = iv.compute(p->1,p->{if(p%10==0){return false;}return true;});
        int nn = iv.compute(p->1,p->{if(p<0){return false;}return true;});
        int interval = iv.compute(p->1,p->{if(p>=3&&p<=17){return false;}return true;});
        
        //System.out.println("Result: " + result);
        //System.out.println("Zahl%10 == 0: " + gzz);
        //System.out.println("Negative Zahle: " + nn);
        System.out.println("Intervall" + interval);
        
    }
}

