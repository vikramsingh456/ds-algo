package array;

public class FindFirstPositive {

	public int findFirstIndex(int[] arr){
		int low=0,high = arr.length-1;
		
		while(low<=high){
			int mid = low + (high - low)/2;
			//int mid = (low+high)/2;
			if(arr[mid]<0 && arr[mid+1]>=0)
				return mid+1;
			
			else if(arr[mid]>0)
				high = mid-1;
			else
				low = mid;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4};
		
		FindFirstPositive firstPositive = new FindFirstPositive();
		System.out.println(firstPositive.findFirstIndex(arr));
	}

}
