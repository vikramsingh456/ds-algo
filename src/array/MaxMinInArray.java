package array;

import java.util.HashMap;
import java.util.Map;

public class MaxMinInArray {
	
	public static Map<String,Integer> getMaxMin(int[] arr){
		Map<String, Integer> maxMin = new HashMap<String, Integer>();
		int arrLength = arr.length;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i=0; i < arrLength - 1; i += 2){
			if(arr[i] < arr[i+1]){
				if(arr[i] < min)
					min = arr[i];
				if(arr[i+1] > max)
					max = arr[i+1];
			}else{
				if(arr[i+1] < min)
					min = arr[i+1];
				if(arr[i] > max)
					max = arr[i];
			}
		}
		
		if((arrLength & 1) == 1){
			if(arr[arrLength - 1] > max)
				max = arr[arrLength -1];
			else if(arr[arrLength - 1] < min)
				min = arr[arrLength - 1];
		}
		maxMin.put("max", max);
		maxMin.put("min", min);
		return maxMin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,-1,6,9,-2,43,93,4};
		System.out.println(getMaxMin(arr));
	}

}
