package linkedlist;

public class testLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedNode node1 = new LinkedNode(1);
		LinkedNode node2 = new LinkedNode(2);
		LinkedNode node3 = new LinkedNode(3);
		LinkedNode node4 = new LinkedNode(4);
		LinkedNode node5 = new LinkedNode(5);
		
		SingleLinkedList sList = new SingleLinkedList();
		sList.insertLast(node1);
		sList.insertLast(node2);
		sList.insertLast(node4);
		sList.insertLast(node4);
		sList.insertLast(node4);
		sList.showList();
	}

}
