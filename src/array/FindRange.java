package array;

import java.util.Arrays;

public class FindRange {

	public int[] searchRange(int arr[], int target){
		int startIndex = firstGreaterOrEqual(arr,target);
		if(startIndex<0 || startIndex>=arr.length || arr[startIndex] != target){
			return new int[]{-1,-1};
		}
		int endIndex = firstGreaterOrEqual(arr,target+1)-1;
		return new int[]{startIndex,endIndex};
		
		
	}
	public int firstGreaterOrEqual(int arr[],int target){
		int low=0,high = arr.length-1;
		
		while(low<=high){
			int mid = low +((high-low)>>1);
			if(arr[mid]<target)
				low = mid+1;
			else
				high = mid-1;
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindRange findRange = new FindRange();
		int arr[] = new int[]{1,1,1,3,3,3,5};
		int target = 1;
		int result[] = findRange.searchRange(arr, target);
		System.out.println("saerch for target "+target +" is found at "+Arrays.toString(result));
	}

}
