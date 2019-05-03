package heap;

import java.util.PriorityQueue;

public class KthSmallest 
{

	public static PriorityQueue<Long> minHeap = new PriorityQueue<Long>();
	
	public int findKthSmallest(int target)
	{
		int findValue = -1;
		
		return findValue;
	}
	
	public static void main(String[] args)
	{
	
		for(long i=0;i<=10000000;i++)
		{
			minHeap.add(i);
			minHeap.remove(i);
		}
		
		System.out.println("Heap size is "+minHeap.size());
		System.out.println("is 100 is present in heap "+minHeap.contains(101));
	}

}
