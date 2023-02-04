public class Testumgebung
{
    public static void main( String[] args )
    {
        test();
    }

    public static void test()
    {

                
        CharacterSearchTree bigTree = new CharacterSearchTree();
        bigTree.iterativeAdd( 'm' ); 
        bigTree.iterativeAdd( 'g' );
        bigTree.iterativeAdd( 'r' ); 
        bigTree.iterativeAdd( 'f' ); 
        bigTree.iterativeAdd( 'k' ); 
        bigTree.iterativeAdd( 'p' ); 
        bigTree.iterativeAdd( 't' );
        bigTree.iterativeAdd( 'b' );
        bigTree.iterativeAdd( 'h' );
        bigTree.iterativeAdd( 'n' );

        System.out.println(bigTree.sortedUpTo(3));
    }
}

