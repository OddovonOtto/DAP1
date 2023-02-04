public class GGCoding 
{
    public static void main( String[] args )
    {
        testCode();
    }
    
    public static void testCode(){
        System.out.println("The Correct Code is: ");
        HuffmanTriple z = new HuffmanTriple('z',20);
        HuffmanTriple v = new HuffmanTriple('v',30);
        HuffmanTriple w = new HuffmanTriple('w',80);
        HuffmanTriple m = new HuffmanTriple('m',60);
        HuffmanTriple y = new HuffmanTriple('y',40);
        HuffmanTriple a = new HuffmanTriple('a',95);
        HuffmanTriple u = new HuffmanTriple('u',45);
        HuffmanTriple[] toTest = {z,v,w,m,y,a,u};
        HuffmanCoding coding = new HuffmanCoding( toTest);
        coding.showCodeTable();
    }
  
}

