public class Testumgebung
{
    public static void main( String[] args )
    {
        IntIntPairs testPairs = new IntIntPairs( 20 );
        testPairs.put(7,3); testPairs.put(4,3); testPairs.put(1,-9); testPairs.put(6,6); testPairs.put(2,8); 
        testPairs.put(41,12); testPairs.put(9,-11); testPairs.put(8,12); testPairs.put(5,-60); testPairs.put(14,18); 
        testPairs.put(0,12); testPairs.put(-9,-16); testPairs.put(0,0); testPairs.put(17,32); testPairs.put(1,1);
        IntIntPairs testPairs2 = new IntIntPairs( 20 );
        testPairs.put(7,3); testPairs.put(4,3); testPairs.put(1,-9);
        
        /*
        System.out.println("Beispiel: " + testPairs.accumulate( (k,v) -> { if (k==0) { return v; } else { return 0; } } ) );

        System.out.print("Beispiel: " + sumUp( testPairs ) ); System.out.println();
     
        testPairs.show();
        addNToValue(testPairs, 5);
        testPairs.show();
     */
       // System.out.println("uniqueKey " + uniqueKey(testPairs, 4));
       //doubleGreaterN(testPairs, 22);
       //testPairs.show();
       IntIntPairs con = concat(testPairs, testPairs2);
       con.show();
       
    }
    
    public static int sumUp(IntIntPairs pairs)
    {
        return pairs.accumulate( (k,v) -> { if (k==0) { return v; } else { return 0; } } );
    }
    
     public static void addNToValue( IntIntPairs pairs, int n ){
         pairs.manipulate((x,y)->(x), (p,z)->(z+n));
     }
     
     public static boolean uniqueKey( IntIntPairs pairs, int n ){
         return pairs.accumulate((x,y)->{if(x == n){return 1;}return 0;})== 1;
     }
     
     public static void doubleGreaterN( IntIntPairs pairs, int n ){
         IntIntPairs temp = pairs.extract((x,y)->(x>n));
         temp.manipulate((x,y)->(x),(z,p)->(p*2));
         pairs.combine(temp);
     }
     
     public static IntIntPairs concat(IntIntPairs first, IntIntPairs second){
         IntIntPairs temp = new IntIntPairs(first.accumulate((x,y)->(1))+second.accumulate((x,y)->(1)));
         first.accumulate((x,y)-> {temp.put(x,y); return 0;});
         second.accumulate((x,y)-> {temp.put(x,y); return 0;});
         return temp;
     }
}
