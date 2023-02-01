public class CharacterSearchTree
{

    // Vorgaben

    private HuffmanTriple content;
    private CharacterSearchTree leftChild, rightChild;
    //1
    public CharacterSearchTree(char[] chars){
        for(int i = 0; i < chars.length; i++){
            iterativeAdd(chars[i]);
        }
    }

    public CharacterSearchTree() 
    {
        content = null;
        leftChild = null;
        rightChild = null;
    }

    public HuffmanTriple getContent()
    {
        if ( !isEmpty() )
        {
            return content;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isEmpty() 
    {
        return content == null;
    }

    public boolean isLeaf() 
    {
        return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
    }

    public void iterativeAdd( char t )
    {
        CharacterSearchTree current = this;
        while ( !current.isEmpty() && current.content.getToken() != t )
        {
            if ( current.content.getToken() > t )
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
        }
        if ( current.isEmpty() ) 
        {
            current.content = new HuffmanTriple( t );
            current.leftChild = new CharacterSearchTree();
            current.rightChild = new CharacterSearchTree();
        }
        else
        {
            current.content.incrementQuantity();
        }
    }
    //2
    public void add(char t, int q, String c){
        CharacterSearchTree current = this;
        while ( !current.isEmpty() && current.content.getToken() != t )
        {
            if ( current.content.getToken() > t )
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
        }
        if ( current.isEmpty() ) 
        {
            current.content = new HuffmanTriple(t,q);
            current.content.setCode(c);
            current.leftChild = new CharacterSearchTree();
            current.rightChild = new CharacterSearchTree();
        }
        else
        {
            for(int i= q; i>0; i--){
                current.content.incrementQuantity();
            }
            current.content.setCode(c);
        }
    }

    public void show()
    {
        if ( !isEmpty() ) 
        {
            leftChild.show();
            System.out.println( content.toString() );
            rightChild.show();
        }
    }
    //3
    public void showPreorder(){
        if(!isEmpty()){
            if(!this.isLeaf()){
                System.out.println(content.toString()); 
            } else {
                System.out.println("*" + content.toString());
            }
            leftChild.showPreorder();
            rightChild.showPreorder();
        }
    }
    //4
    public int height(){
        if(this.isLeaf()){
            return 1;
        } else if(!leftChild.isEmpty()&& !rightChild.isEmpty()){
            if(leftChild.height()>rightChild.height()){
                return 1 + leftChild.height();
            }
            return 1 + rightChild.height();
        } else if(rightChild.isEmpty()&&!leftChild.isEmpty()){
            return 1 + leftChild.height();
        } else {
            return 1 + rightChild.height();
        }
    }
    //5
    public int countCharacters(){
        if(!isEmpty()){
            return content.getQuantity() + leftChild.countCharacters() + rightChild.countCharacters();  
        }
        return 0;
    }
    //Later again
    public int longestCode(){
        if(!isEmpty()){
            if(leftChild.content.getCode().length()>rightChild.content.getCode().length()){
            return leftChild.content.getCode().length();
        } 
            return rightChild.content.getCode().length();
        }
        return 0;
    }
    //7
    public HuffmanTriple minimum(){
        
        if(!isEmpty()){
            CharacterSearchTree current = this;
            while(!current.leftChild.isEmpty()){
                current = current.leftChild;
            }
            return current.getContent();
        } else {
            return null;
        }
    }
    //8
    public boolean hasOnlyCompleteNodes(){
        if(content == null && leftChild == null && rightChild == null){
                return true;
            }
        
        if(isLeaf()){
            return true;
        } else {
            if(leftChild.isEmpty()&&!rightChild.isEmpty()||!leftChild.isEmpty()&&rightChild.isEmpty()){
                return false;
            }
            return leftChild.hasOnlyCompleteNodes()&&rightChild.hasOnlyCompleteNodes();
            
        }
    }
    //9
    public boolean containsCharacter(char t){
        CharacterSearchTree current = this;
        if(!current.isEmpty()){
            while(!current.isEmpty() && current.content.getToken()!=t){
                if(current.content.getToken()<t){
                    current = current.rightChild;
                } else {
                    current = current.leftChild;
                }
            }
            if(current.isEmpty()){
                return false;
            }
            return true;
        }
        return false;
    }
    //10
    public boolean equalStructure(CharacterSearchTree cst){        
        if((content == null && cst.content != null)||(content != null && cst.content == null)){
            return false;
        } else {
            if(content == null && cst.content == null){
                return true;
            }
            return leftChild.equalStructure(cst.leftChild) == rightChild.equalStructure(cst.rightChild); 
        }
    }
    //11
    public CharacterSearchTree rotateNodeToRight(){
        CharacterSearchTree current = this;
        CharacterSearchTree leftC = current.leftChild;
        if(current.isEmpty() || leftChild.isEmpty()){
            return current;
        }else {
            current.leftChild = leftC.rightChild;
            leftC.rightChild = current;
            return leftC;
        }
    }
    

    
}
