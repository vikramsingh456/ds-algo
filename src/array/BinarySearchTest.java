package array;

public class BinarySearchTest {
	
	public int binarySearch(int arr[],int value){
		
		return binarySearch(arr,value,0,arr.length-1);
	}

	public int binarySearch(int arr[],int value,int lowIndex,int highIndex){
		int findIndex = -1,mid;
		while(lowIndex <= highIndex){
			mid = lowIndex + ((highIndex-lowIndex)>>1);
			if(arr[mid] == value){
				findIndex = mid+1;
				return findIndex;
			}
			if(arr[mid]>value){
				highIndex = mid-1;
			}else{
				lowIndex = mid+1;
			}
			
		}
		
		return findIndex;
	}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		BinarySearchTest binarySearch = new BinarySearchTest();
		int[] arr = {1,2,3,4,5,6,7,8,9,10,12,13,17,45,89,90,12121};
		for(int i=0;i<arr.length;i++){
			int foundIndex = binarySearch.binarySearch(arr, arr[i]);
			System.out.println("Value "+arr[i]+" found at "+foundIndex);
		}
		System.out.println("found "+binarySearch.binarySearch(arr, 1832));
		
	}

}
