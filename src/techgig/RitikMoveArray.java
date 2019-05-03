package techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import numbers.AllPrimeNumbers;
import numbers.IsPrime;
import util.array.ArrayUtil;
import array.TwoArraySum;

public class RitikMoveArray {
	
	public static boolean isPrime(int num){
	    if ( num > 2 && num%2 == 0 ) {
	        return false;
	    }
	    int top = (int)Math.sqrt(num) + 1;
	    for(int i = 2; i < top; i+=2){
	        if(num % i == 0){
	            return false;
	        }
	    }
	    return true; 
	}
	
	public static List<Integer> allPrimeNumbers(int startIndex, int endIndex){
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for(int theNumber = startIndex; theNumber<=endIndex; theNumber++){
			if(isPrime(theNumber)){
				primeNumbers.add(theNumber);
			}
		}
		return primeNumbers;
	}
	
	public static int[] isFoundByTwoPointers(int[] arr, int sum){
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
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int N = scanner.nextInt();
		
		int[] arr = new int[N];
		int arrSum = 0;
		for(int i=0; i < N; i++){
			arr[i] = scanner.nextInt();
			arrSum += arr[i];
		}
		
		List<Integer> primeNumberList = allPrimeNumbers(2,arrSum);
		int[] primeNubmerArray = primeNumberList.stream()
				  .mapToInt(Integer::intValue)
				  .toArray();
		
		int[] twoValues = null;
		for(int i=0; i < N-K; i++){
			twoValues  = null;
			twoValues = isFoundByTwoPointers(primeNubmerArray,(arr[i] + arr[i+K]));
			if(twoValues != null){
				arr[i] = twoValues[0];
				arr[i+K] = twoValues[1];
			}
			
		}
		for(int i=0; i < N; i++){
			if(!isPrime(arr[i])){
				System.out.println("-1");
				return;
			}
		}
		System.out.println("1");
		scanner.close();
	}

}
