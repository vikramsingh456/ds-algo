package util.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {
	
	public static void printIntArray(int[] arr){
		printIntArray(arr,arr.length);
	}
	
	public static void printIntArray(int[] arr, int length ){
		for(int i=0;i<length;i++){
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}
	
	public static int getMax(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i : arr){
			if(i > max){
				max = i;
			}
		}
		return max;
	}
	
	public static int getMin(int[] arr){
		int min = Integer.MAX_VALUE;
		for(int i : arr){
			if(i < min){
				min = i;
			}
		}
		return min;
	}
	
	public static Object[] intCommonInTwoArray(int a[], int b[]){
		
		int firstPointer = 0,secondPointer = 0,tempPointer = 0;
		int shorterLength = (a.length>b.length)?a.length:b.length;
		List tempArr = new ArrayList();
		
		for(int i=0;i<shorterLength;i++){
			if(a[firstPointer] == b[secondPointer]){
				 tempArr.add(a[firstPointer]);
				firstPointer++;
				secondPointer++;
			}else  if(a[firstPointer]>b[secondPointer]){
				secondPointer++;
			}else {
				firstPointer++;
			}
		}
		return tempArr.toArray();
	} 
}
