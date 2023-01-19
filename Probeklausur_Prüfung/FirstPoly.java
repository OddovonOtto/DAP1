
public class FirstPoly{
    public static void m( double p ) { System.out.print( "A " ); }
    public static void m( int p ) { System.out.print( "L " ); }
    public static void m( char p ) { System.out.print( "X " ); }
    public static void run() {
        m( 'a' );
        m( 7 / 3.0 );
        m( 'a' / 'b' );
        m( new Integer( 5 ) );
}
}
