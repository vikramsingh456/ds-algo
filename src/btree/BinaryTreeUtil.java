package btree;

public class BinaryTreeUtil
{

	public int nodeCount(BinaryTreeNode root)
	{

		return (root == null)? 0 : 1+nodeCount(root.getLeft()) + nodeCount(root.getRight());
	}
	
	public boolean searchNode(BinaryTreeNode root ,int data)
	{
		if(root == null)
			return false;
		
		if(data == root.getData())
			return true;
		return searchNode(root.getLeft(),data) || searchNode(root.getRight(),data);
		
	}
	
	public void insertNode(BinaryTreeNode root,int data)
	{
		if(root == null)
		{
			root = new BinaryTreeNode(data);
		}
		else
		{
			insertHelper(root,data);
		}
	}
	
	private void insertHelper(BinaryTreeNode root,int data)
	{
		if(root.getData() >= data)
		{
			if(root.getLeft() == null)
			{
				root.setLeft(new BinaryTreeNode(data));
			}
			else
			{
				insertHelper(root.getLeft(),data);
			}
		}
		else
		{
			if(root.getRight() == null)
			{
				root.setRight(new BinaryTreeNode(data));
			}
			else
			{
				insertHelper(root.getRight(),data);
			}
		}
	}
	
	public int maxHeight(BinaryTreeNode root)
	{
		if(root == null)
			return 0;
		
		int leftHeight,rightHeight;
		leftHeight = maxHeight(root.getLeft())+1;
		rightHeight = maxHeight(root.getRight())+1;
		return (leftHeight > rightHeight)? leftHeight:rightHeight;
	}
	
	public int deepestNode(BinaryTreeNode root)
	{
		return helperDeepestNode(root,0);
	}
	
	private int helperDeepestNode(BinaryTreeNode root,int deepCount)
	{
		if(root == null)
			return deepCount;
	
		return 0;
		
	}
}
