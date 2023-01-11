public class Testumgebung
{
    public static void main( String[] args )
    {
        testMethods();
    }
    
    private static void testMethods()
    {
        char[] chars = {'n','d','a','f','b','e','k','i','x','o','s','z','r'};
        char[] chars2 = {'n','d','x','a','f'};
        CharacterSearchTree cst = new CharacterSearchTree( chars );
        CharacterSearchTree cst2 = new CharacterSearchTree(chars2);
        
        //System.out.println("cst.show() - SOLL-Ergebnis: a b d e f i k n o r s x z");
        cst2.show();
        System.out.println("Soll: a,d,f,n,x");
        CharacterSearchTree cst3 = cst2.rotateNodeToRight();
        cst3.show();
        
        /*
        System.out.println("cst.show() - SOLL-Ergebnis: n d a b f e k i x o s r z");
        cst.showPreOrder();
        */
        // weitere Tests ergaenzen
    }

}

