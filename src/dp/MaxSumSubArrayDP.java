package dp;

import java.util.Arrays;

public class MaxSumSubArrayDP {

	public static void solveSumArray(int arr[]){
		
		System.out.println(Arrays.toString(arr));
		int solutions[] = new int[arr.length+1];
		solutions[0] = 0;
		
		for(int i=1;i<=arr.length;i++){
			solutions[i] = Math.max(solutions[i-1]+arr[i-1] , 0);
		}
		
		System.out.println("Solutions array");
		System.out.println(Arrays.toString(solutions));
		
		int maxSum = solutions[0];
		for(int i=1;i<solutions.length;i++){
			maxSum = Math.max(maxSum, solutions[i]);
		}
		
		System.out.println("Maximum sum of subarray is "+maxSum);
	}
	
	public static void main(String[] args){
		
		int arr[] = {-2,11,-4,13,-5,2};
		MaxSumSubArrayDP.solveSumArray(arr);
	}
}
