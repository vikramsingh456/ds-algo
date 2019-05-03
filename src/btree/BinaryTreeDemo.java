package btree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node1 = new BinaryTreeNode(2);
		BinaryTreeNode node2 = new BinaryTreeNode(3);
		BinaryTreeNode node3 = new BinaryTreeNode(4);
		BinaryTreeNode node4 = new BinaryTreeNode(5);
		BinaryTreeNode node5 = new BinaryTreeNode(6);
		BinaryTreeNode node6 = new BinaryTreeNode(7);
		BinaryTreeNode node7 = new BinaryTreeNode(8);
		BinaryTreeNode node8 = new BinaryTreeNode(9);
		BinaryTreeNode node9 = new BinaryTreeNode(10);
		BinaryTreeNode node10 = new BinaryTreeNode(11);
		
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node3.setLeft(node7);
		node3.setRight(node8);
		node4.setLeft(node9);
		node4.setRight(node10);
		
		BinaryTreeTraversal treeTraversal = new BinaryTreeTraversal();
		BinaryTreeUtil treeUtil = new BinaryTreeUtil();
		treeTraversal.preOrder(root);
		System.out.println();
		treeTraversal.inOrder(root);
		System.out.println();
		treeTraversal.postOrder(root);
		
		System.out.println();
		System.out.println("Total node = "+treeUtil.nodeCount(root)); 
		
		System.out.println();
		int data = 8;
		System.out.println("Search node "+data+" = "+treeUtil.searchNode(root,data));
		
		data = -1;
		treeUtil.insertNode(root, data);
		System.out.println("Search node "+data+" = "+treeUtil.searchNode(root,data));
		
		System.out.println("Height of Tree is "+ treeUtil.maxHeight(root)); 
		
		
	}

}
