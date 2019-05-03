package linkedlist;

public class LinkedNode {
	
	private int data;
	private LinkedNode next;
	
	public LinkedNode(int data){
		this.data = data; 
		this.next = null;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public LinkedNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(LinkedNode next) {
		this.next = next;
	}
	
	
}
