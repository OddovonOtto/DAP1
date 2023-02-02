public class Testumgebung
{ 
    public static void main( String[] args )
    {
        test();
    }

    public static void test()
    {

        CharacterSearchTree tree = new CharacterSearchTree();
        tree.iterativeAdd('h');
        tree.iterativeAdd('a');
        tree.iterativeAdd(' ');
        tree.iterativeAdd('b');
        tree.iterativeAdd('j');  
        tree.iterativeAdd('i');
        
        System.out.println(tree.shortest());
        
        
        
        
    }
}

