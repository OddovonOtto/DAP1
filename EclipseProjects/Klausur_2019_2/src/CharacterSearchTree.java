public class CharacterSearchTree
{

    //--- hier ergaenzen ---
    public int apply() {
    	if(isEmpty()) {
    		return 0;
    	} else {
    		
    		if(content.getQuantity()>1 && (!leftChild.isEmpty() || !rightChild.isEmpty())) {
    			return 1 + leftChild.apply() + rightChild.apply();
    		}
    		return leftChild.apply() + rightChild.apply();
    	}
    }
    
    public void allInner(int i) {
    	if(!isEmpty()) {
    		if(!isLeaf()) {
    			leftChild.allInner(i);
    			System.out.println(content);
    			rightChild.allInner(i);
    		}
    	}
    }
    
    public boolean onPathTo(char obj, char target) {
    	return pathCheck(obj, target, false);
    }
    
    public boolean pathCheck(char obj, char target, boolean found) {
    	if(!isEmpty()) {
    	    boolean returnFound = found;
    	    if(content.getToken() == obj) {
    		    returnFound = true;
    	    }
    	    if(content.getToken()== target) {
    		    return returnFound;
         	}
         	return leftChild.pathCheck(obj, target, returnFound) || rightChild.pathCheck(obj, target, returnFound);
    	} else {
    		return false;
    	}
    }

    
    
    // --- Vorgaben ---

    private HuffmanTriple content;
    private CharacterSearchTree leftChild, rightChild;

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

    public void show()
    {
        if ( !isEmpty() ) 
        {
            leftChild.show();
            System.out.println( content.toString() );
            rightChild.show();
        }
    }
    
    public int minimal() {
    	if(isLeaf()||isEmpty()) {
    		return 0;
    	} else {
    		int lT = leftChild.minimal()+1;
    		int rT = rightChild.minimal()+1;
    		if(lT <=rT) {
    			return lT;
    		}
    		return rT;
    	}
    }
    	
    public HuffmanTriple bigOnLevel(int n) {
    	if(isEmpty()) {
    		return null;
    	}else {
    		if(n==0) {
    			return content;
    		}
    		HuffmanTriple lT = leftChild.bigOnLevel(n-1);
    		HuffmanTriple rT = rightChild.bigOnLevel(n-1);
    		if(lT == null && rT == null) {
    			return null;
    		} else if(lT != null && rT == null){
    			return lT;
    			
    		} else if(lT == null && rT != null) {
    			return rT;
    		}else {
    			if(lT.getToken() > rT.getToken()){
    				return lT;
    			}
    			return rT;
    			
    		}
    		
    	}
    }
    
    public int shortest() {
    	if(!isEmpty()) {
    		if(leftChild.isEmpty()!= rightChild.isEmpty()) {
    			return 1;
    		}
    		int lT = leftChild.shortest();
    		int rT = rightChild.shortest();
    		
    		if(lT == 0 && rT == 0) 
    			return 0;
    			
    		if(lT==0 && rT!=0) {
    			return rT+1;
    		}
    		if(lT!=0 && rT==0) {
    			return lT+1;
    		}
    			
    		if(lT <= rT) {
    			return lT+1;
    		}
    		return rT+1;
    		
    		
    	}else {
    		return 0;
    	}
    }
}
    
    


