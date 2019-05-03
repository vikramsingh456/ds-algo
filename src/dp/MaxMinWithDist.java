package dp;

import util.array.ArrayUtil;

public class MaxMinWithDist {

	public int maxSequence(int[] arr){
		int[] maxValue = new int[arr.length];
		maxValue[0] = arr[0];
		maxValue[1] = Math.max(arr[0], arr[1]);
		maxValue[2] = Math.max(arr[1], arr[2]);
		
		for(int arrIndex=3; arrIndex < arr.length; arrIndex++){
			maxValue[arrIndex] = Math.max(arr[arrIndex]+maxValue[arrIndex-3], Math.max(maxValue[arrIndex - 1], maxValue[arrIndex - 2]));
		}
		ArrayUtil.printIntArray(maxValue);
		return maxValue[maxValue.length-1];
	}
	
	public int minSequence(int[] arr){
	
		int[] minValue = new int[arr.length];
		minValue[0] = arr[0];
		minValue[1] = Math.min(arr[0], arr[1]);
		minValue[2] = Math.min(arr[1], arr[2]);
		
		for(int arrIndex=3; arrIndex < arr.length; arrIndex++){
			minValue[arrIndex] = Math.min(arr[arrIndex]+minValue[arrIndex-3], Math.min(minValue[arrIndex - 1], minValue[arrIndex - 2]));
		}
		ArrayUtil.printIntArray(minValue);
		return minValue[minValue.length-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMinWithDist minMax = new MaxMinWithDist();
		int[] arr = {3,4,-2,1,-2,4,6,-3,5};
		minMax.maxSequence(arr);
		minMax.minSequence(arr);
	}

}
