public class CharacterSearchTree {
	
	private HuffmanTriple content;
	private CharacterSearchTree leftChild, rightChild;

	public CharacterSearchTree() {
		content = null;
		leftChild = null;
		rightChild = null;
	}

	public HuffmanTriple getContent() {
		if (!isEmpty()) {
			return content;
		} else {
			throw new RuntimeException();
		}
	}

	public boolean isEmpty() {
		return content == null;
	}

	public boolean isLeaf() {
		return !isEmpty() && leftChild.isEmpty() && rightChild.isEmpty();
	}

	public void iterativeAdd(char t) {
		CharacterSearchTree current = this;
		while (!current.isEmpty() && current.content.getToken() != t) {
			if (current.content.getToken() > t) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		if (current.isEmpty()) {
			current.content = new HuffmanTriple(t);
			current.leftChild = new CharacterSearchTree();
			current.rightChild = new CharacterSearchTree();
		} else {
			current.content.incrementQuantity();
		}
	}

	public void show() {
		if (!isEmpty()) {
			leftChild.show();
			System.out.println(content.toString());
			rightChild.show();
		}
	}

	public int leavesAtLevel(int n) {
		if (n < 0 || isEmpty()) {
			return 0;
		} else {
			if (n > 0) {
				return leftChild.leavesAtLevel(n - 1) + rightChild.leavesAtLevel(n - 1);
			} else {
				return 1;
			}

		}
	}
	//Task 1
	
	public int countNodes(int top, int bottom) {
		if(top<=bottom && !isEmpty()) {
			if(top>0) {
				return leftChild.countNodes(top-1,bottom) 
						+ rightChild.countNodes(top-1, bottom);
			} else {
				return leftChild.countNodes(top, bottom-1) 
						+ rightChild.countNodes(top, bottom-1) +1;
			}
			
		} else {
			return 0;
		}
		
	}
	
	//Task 2 uncomplete
	
	public int sortedUpTo(int n) {
		if(n>0&&!isEmpty()) {
			int count = leftChild.sortedUpTo(n);
			if(count >= 0) {
			    System.out.println(content);
			}
		    count -= rightChild.sortedUpTo(count);
			return n-1;
		}
		return n;
		
	}
	
	public HuffmanTriple largestOn(int level) {
		if(!isEmpty()&&level>=0) {
			if(level == 0) {
				return content;
			}
			HuffmanTriple lT = leftChild.largestOn(level-1);
			HuffmanTriple rT = rightChild.largestOn(level-1);
			
			if(lT!= null && rT != null) {
				if(lT.getToken()>= rT.getToken()) {
					return lT;
				}
				return rT;
			} else if(lT == null){
				return rT;
			} else {
				return lT;
			}
			
			} else {
				return null;
			}
		}
	}


