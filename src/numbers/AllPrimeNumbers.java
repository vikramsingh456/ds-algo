package numbers;

import java.util.ArrayList;
import java.util.List;

public class AllPrimeNumbers {
	
	public static List<Integer> allPrimeNumbers(int startIndex, int endIndex){
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for(int theNumber = startIndex; theNumber<=endIndex; theNumber++){
			if(IsPrime.isPrime(theNumber)){
				primeNumbers.add(theNumber);
			}
		}
		return primeNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> primeNumberList = allPrimeNumbers(1,100);
		int[] primeNubmerArray = primeNumberList.stream()
				  .mapToInt(Integer::intValue)
				  .toArray();
		
		System.out.println(primeNumberList);
	}

}
