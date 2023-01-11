
public class TestMethods
{
    public static void main( String[] args )
    {
        testMethods();
    }

    public static void testMethods()
    {

        Fraction[] testArr1 = {new Fraction(1,5), new Fraction(1,4), new Fraction(1,3), new Fraction(1,2), new Fraction(1,1)};
        Fraction[] testArr2 = {new Fraction(1,5), new Fraction(1,4), new Fraction(1,3), new Fraction(1,2), new Fraction(1,10)};
        Fraction[] testArr3 = {new Fraction(1,2), new Fraction(1,4), new Fraction(1,5), new Fraction(1,6), new Fraction(1,7)};
        Fraction[] testArr4 = {new Fraction(-1,2), new Fraction(-1,4), new Fraction(-1,5), new Fraction(-1,6), new Fraction(1,7)};
        Fraction[] testArr5 = {new Fraction(1,2), new Fraction(-1,4), new Fraction(-1,5), new Fraction(-1,6), new Fraction(-1,7)};
        Fraction[] testArr6 = {new Fraction(-1,2), new Fraction(1,4), new Fraction(1,5), new Fraction(1,4), new Fraction(-1,2)};
        Fraction[] testArr7 = {new Fraction(1,2), new Fraction(1,3), new Fraction(1,4), new Fraction(1,4), new Fraction(1,3), new Fraction(1,2)};

        System.out.println("Test maximum");
        System.out.println("SOLL: 1/1 - IST: " + Revision.maximum( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + Revision.maximum( testArr2, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + Revision.maximum( testArr3, testArr1.length-1 ) );
        
        System.out.println("Test lastPositive");
        System.out.println("SOLL: 1/1 - IST: " + Revision.lastPositive( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: 1/7 - IST: " + Revision.lastPositive( testArr3, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + Revision.lastPositive( testArr5, testArr1.length-1 ) );
        System.out.println("SOLL: 1/4 - IST: " + Revision.lastPositive( testArr6, testArr1.length-1 ) );
        
        System.out.println("Test firstPositive");
        System.out.println("SOLL: 1/5 - IST: " + Revision.firstPositive( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: 1/7 - IST: " + Revision.firstPositive( testArr4, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + Revision.firstPositive( testArr5, testArr1.length-1 ) );
        System.out.println("SOLL: 1/4 - IST: " + Revision.firstPositive( testArr6, testArr1.length-1 ) );
        
        System.out.println("Test isSorted");
        System.out.println("SOLL: true  - IST: " + Revision.isSorted( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: true  - IST: " + Revision.isSorted( testArr4, testArr1.length-1 ) );
        System.out.println("SOLL: false - IST: " + Revision.isSorted( testArr6, testArr1.length-1 ) );
        
        System.out.println("Test contains");
        System.out.println("SOLL: true  - IST: " + Revision.contains( testArr1, testArr1.length-1, new Fraction(1,5) ) );
        System.out.println("SOLL: true  - IST: " + Revision.contains( testArr4, testArr1.length-1, new Fraction(-1,5) ) );
        System.out.println("SOLL: true  - IST: " + Revision.contains( testArr5, testArr1.length-1, new Fraction(-1,7) ) );
        System.out.println("SOLL: false - IST: " + Revision.contains( testArr5, testArr1.length-1, new Fraction(1,9) ) );
        
        System.out.println("Test countPositives");
        System.out.println("SOLL: 4  - IST: " + Revision.countPositives( testArr1, 1,testArr1.length-1 ) );
        System.out.println("SOLL: 0  - IST: " + Revision.countPositives( testArr4, 0,testArr1.length-2 ) );
        System.out.println("SOLL: 3  - IST: " + Revision.countPositives( testArr6, 0,testArr1.length-1 ) );
        
        System.out.println("Test contentCheck");
        System.out.println("SOLL: true  - IST: " + Revision.contentCheck( testArr1, testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: false - IST: " + Revision.contentCheck( testArr4, testArr5, testArr1.length-1 ) );
        
        System.out.println("Test palindromCheck");
        System.out.println("SOLL: true  - IST: " + Revision.palindromCheck( testArr6, 0 ) );
        System.out.println("SOLL: true  - IST: " + Revision.palindromCheck( testArr7, 0 ) );
        System.out.println("SOLL: false - IST: " + Revision.palindromCheck( testArr4, 0 ) );
        
        System.out.println("Test getIndex");
        System.out.println("SOLL: 0   - IST: " + Revision.getIndex( testArr1, testArr1.length-1, new Fraction(1,5) ) );
        System.out.println("SOLL: 4   - IST: " + Revision.getIndex( testArr2, testArr1.length-1, new Fraction(1,10) ) );
        System.out.println("SOLL: -1  - IST: " + Revision.getIndex( testArr5, testArr1.length-1, new Fraction(1,10) ) );
    }

}
