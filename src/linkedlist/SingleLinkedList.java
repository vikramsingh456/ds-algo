package linkedlist;

public class SingleLinkedList {
	
	private LinkedNode head;
	private int length;
	
	public SingleLinkedList(){
		length = 0;
		head = null;
	}
	
	private void incrementLength(){
		length++;
	}
	public  LinkedNode getHead(){
		return head;
	}
	
	public void setHead(LinkedNode head){
		this.head = head;
	}
	
	public void insertAtBegin(LinkedNode node){
		node.setNext(head);
		head = node;
		incrementLength();
	}
	
	public void insertLast(LinkedNode node){
		if(head == null){
			head = node;
		}else{
			LinkedNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			p.setNext(node);
			node.setNext(null);
			incrementLength();
		}
		
	}
	
	public void showList(){
		for(LinkedNode p = head;p!=null;p=p.getNext()){
			System.out.println(p.getData());
		}
	}
}
