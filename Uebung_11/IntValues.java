public class IntValues {
    private int[] data;
    public IntValues( int[] p ) {
        data = p; 
    }
    public int compute( IntIntFunction f, IntBoolFunction b ) {
        int comp = 0;
        for ( int i=0; i<data.length && b.test( data[i] ); i++ ) {
            comp += f.apply( data[i] );
        }
        return comp;
    }
}