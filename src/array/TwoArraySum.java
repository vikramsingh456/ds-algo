package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArraySum {

	public boolean isFoundBySet(int[] arr,int sum){
		Set<Integer> s =  new HashSet<Integer>();
		for(int i :arr){
			s.add(i);
		}
		
		//s.stream().forEach(n -> System.out.println("num = "+n));
		for(int theNum : arr){
			if(s.contains(sum - theNum)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isFoundByTwoPointers(int[] arr, int sum){
		int startIndex = 0,lastIndex = arr.length-1;
		int curSum = 0;
		while(startIndex < lastIndex){
			curSum = arr[startIndex] + arr[lastIndex];
			if(curSum == sum){
				return true;
			}
			if(curSum > sum)
				lastIndex--;
			else 
				startIndex++;
		}
				
		return false;
	}
	
	public static int[] isFoundByTwoPointers1(int[] arr, int sum){
		int startIndex = 0,lastIndex = arr.length-1;
		int curSum = 0;
		while(startIndex < lastIndex){
			curSum = arr[startIndex] + arr[lastIndex];
			if(curSum == sum){
				return new int[]{arr[startIndex], arr[lastIndex]};
			}
			if(curSum > sum)
				lastIndex--;
			else 
				startIndex++;
		}
				
		return null;
	}
	
	public static void main(String[] s){
		TwoArraySum twoSum = new TwoArraySum();
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		int sum = 110;
		System.out.println(twoSum.isFoundBySet(arr, sum));
		System.out.println(twoSum.isFoundByTwoPointers(arr, sum));
	}
}
