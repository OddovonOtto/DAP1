public class EasyPoly
{
    public static void main( String[] args )
    {
        m('a');
        m(7/3.0);
        m('a'/'b');
        m(new Integer(5));
    }
    
    public static void m(double p) {
    	System.out.println("A");
    }
    
    public static void m(int p) {
    	System.out.println("L");
    }
    
    public static void m(char p) {
    	System.out.println("X");
    }
    
}

