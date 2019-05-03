package array;

import java.util.Arrays;
import java.util.Scanner;

import util.array.ArrayUtil;

class Result  
{  
   public int max1;  
   public int max2;  
}

public class SecondLargest {
	
	public static int secondHighestValue = -1;

	public int bruteForce(int[] arr){
		int firstLargest = Integer.MIN_VALUE,secondLargest = Integer.MIN_VALUE;
		
		for(int theNum : arr){
			if(theNum > firstLargest){
				secondLargest = firstLargest;
				firstLargest = theNum;
			}else if(theNum > secondLargest){
				secondLargest = theNum;
			}
		}
		return secondLargest;
	}
	
	public int nextPowerOf2(int num){
		int  theNum = 1;
		while(theNum <= num){
			theNum = theNum << 1;
		}
		return theNum;
	}
	
	public int byDAndC(int[] arr){
		int[] tempArr = new int[(arr.length/2)];
		int[] tempArr1 = Arrays.copyOf(arr, arr.length);
		
		int index = byDAndC(tempArr1,tempArr,arr.length); 
		int child1 = index*2;
		int child2 = child1+1;
		if(arr[child1] < arr[child2] ){
			System.out.println("in if "+child1+ " , "+child2);
			ArrayUtil.printIntArray(arr, tempArr.length);
			if(arr[child1] > secondHighestValue)
				secondHighestValue = arr[child1];
			return child2;
		}else{
			System.out.println("in else "+child1+ " , "+child2);
			ArrayUtil.printIntArray(arr, tempArr.length);
			if(arr[child2] > secondHighestValue)
				secondHighestValue = arr[child2];
			return child1;
		}
		
	}
	
	public int byDAndC(int[] arr, int[] tempArr ,int tempLength){
		int secondLargestIndex = -1;
		int secondLarges = -1;
		int index = -1;
		if(tempArr.length == 0)
			return -1;
		
		if(tempArr.length == 1)
			return 0;
		
		
			ArrayUtil.printIntArray(arr, tempLength);
			ArrayUtil.printIntArray(tempArr, tempArr.length);
			
			for(int i=0,j=0;i<tempLength; i = i+2){
				if(arr[i] < arr[i+1]){
					tempArr[j++] = arr[i+1];
				}else{
					tempArr[j++] = arr[i];
				}
			} 
			tempLength = tempLength / 2;
			if(tempLength >=1)
				index = byDAndC(tempArr,new int[tempLength/2],tempLength);
			int child1 = index*2;
			int child2 = child1 + 1;
			
			if(tempArr[child1] < tempArr[child2] ){
				System.out.println("in if "+child1+ " , "+child2);
				ArrayUtil.printIntArray(tempArr, tempArr.length);
				if(tempArr[child1] > secondHighestValue)
					secondHighestValue = tempArr[child1];
				return child2;
			}else{
				System.out.println("in else "+child1+ " , "+child2);
				ArrayUtil.printIntArray(tempArr, tempArr.length);
				if(tempArr[child2] > secondHighestValue)
					secondHighestValue = tempArr[child2];
				return child1;
			}
			//System.out.println("----");
			//ArrayUtil.printIntArray(tempArr,tempLength);
			//System.out.println("----");
		
	}
	
	
	  
	  
	//Receives input array along with left  
	//and right array indices which are used  
	//to split the array into two halves  
	public Result FirstSecondMax(int A[], int l, int r)  
	{  
	    System.out.println("call");
		//Output result  
	    Result res = new Result();  
	    res.max1 = A[l];  
	    res.max2 = A[l];  
	      
	    //if array has only one element return null record  
	    if (l == r) return res;  
	      
	    //Base case when array has only two elements  
	    if (r - l == 1)  
	    {  
	        //If the right element is greater than  
	        //the left element then the right element  
	        //is the first maximum  
	        if (A[r] >= A[l])  
	        {  
	            res.max1 = A[r];  
	            res.max2 = A[l];  
	        }  
	        else  
	        {  
	            res.max1 = A[l];  
	            res.max2 = A[r];  
	        }  
	          
	        return res;  
	    }  
	  
	   //Find middle element  
	   int m = (l + r)/2;  
	     
	   //Find the largest two elements in each half  
	   Result lres = FirstSecondMax(A, l, m);  
	   Result rres = FirstSecondMax(A, m + 1, r);  
	  
	   //So far we got 4 max values 2 on each half  
	   //so we need to merge them and take out only  
	   //two. Basically you compare the largest element  
	   //on the right side with the largest element on  
	   //the left side and take the greater one as the  
	   //result first max. In case the taken one was the  
	   //first max on the right then you need to compare  
	   //the second max on the right with the first max  
	   //on the left. If it is greater then you take it  
	   //as the second max otherwise you take the first  
	   //max on the left as the result second max. You  
	   //do the same if the taken one was on the left.  
	   //The code segment below demonstrates that  
	  
	   //First max on the right is greater than  
	   //first max on the left  
	   if (rres.max1 >= lres.max1)  
	   {  
	       //Take the first max on the right  
	       res.max1 = rres.max1;  
	  
	       //Compare second max on the right with  
	       //first max on the left  
	       if (rres.max2 >= lres.max1)  
	       {  
	           res.max2 = rres.max2;  
	       }  
	       else  
	       {  
	           res.max2 = lres.max1;  
	       }  
	   }  
	   //First max on the left is greater than  
	   //first max on the right  
	   else  
	   {  
	       //Take the first max on the left  
	       res.max1 = lres.max1;  
	  
	       //Compare second max on the left with  
	       //first max on the right  
	       if (lres.max2 >= rres.max1)  
	       {  
	           res.max2 = lres.max2;  
	       }  
	       else  
	       {  
	           res.max2 = rres.max1;  
	       }  
	  }  
	  
	   return res;  
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SecondLargest scLargest = new SecondLargest();
		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();
		int nextPowerValue = scLargest.nextPowerOf2(arraySize);
		int[] arr = new int[nextPowerValue];
		for(int i=0;i<arraySize;i++){
			arr[i] = scanner.nextInt();
		}
		for(int i=arraySize;i<nextPowerValue;i++){
			arr[i] = Integer.MIN_VALUE;
		}
		int largest =  scLargest.byDAndC(arr);
		System.out.println("First Largest "+arr[largest]+" ,Second Largest "+secondHighestValue);
		
		//Result res=  scLargest.FirstSecondMax(arr,0,arr.length-1);
		//System.out.println(res.max1+" ,"+res.max2);
		
	}
	

}

