import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


class CharacterSearchTreeTest {
	
	@BeforeClass 
	public CharacterSearchTree setUpClass() {
		CharacterSearchTree tree = new CharacterSearchTree();
		tree.iterativeAdd('h');tree.iterativeAdd('o');tree.iterativeAdd('p');tree.iterativeAdd('f');tree.iterativeAdd('e');
		return tree;
	}

	@Test
	void testIsLeafButNotALeaf() {
		CharacterSearchTree tree = setUpClass();
		Assert.assertFalse(tree.isLeaf());
	}
	

	@Test
	void testHeight() {
		CharacterSearchTree tree = setUpClass();
		Assert.assertEquals(3, tree.height());
	}
	
	@Test
	void testHeightFalse() {
		CharacterSearchTree tree = setUpClass();
		Assert.assertNotEquals(2, tree.height());
	}

}
