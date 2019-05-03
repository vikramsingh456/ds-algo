package heap;

public class UHeap {

	private int[] array;
	private int count;
	private int capacity;
	private int heapType; //1 for max heap,2 min heap
	
	
	public UHeap(){
		this(16,1);
	}

	public UHeap(int capacity, int heapType) {
		this.capacity = capacity;
		this.heapType = heapType;
		this.count = 0;
		this.array = new int[capacity];
	}
	
	public int getParent(int curNode){
		if(curNode<0 || curNode>=this.count)
			return -1;
		
		return curNode-1/2;
	}
	
	public int leftChild(int curNode){
		int left = 2*curNode +1;
		if(left>=this.count)
			return -1;
		else 
			return left;
	}
	
	public int rightChild(int curNode){
		int right = 2*curNode+2;
		if(right>=this.count)
			return -1;
		else 
			return right;
	}
	
	public int rootValue(){
		if(this.count == 0)
			return -1;
		else 
			return this.array[0];
	}
	
	public static  void main(String[] args){
		new UHeap();
	}
	
	
}
