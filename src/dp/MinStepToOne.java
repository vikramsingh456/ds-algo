package dp;

import java.util.Arrays;

public class MinStepToOne {

	static int memo[];
	static int  numCall=0;
	public static int topDownApproach(int num){
		
		//System.out.println("No of call in top down "+(numCall++));
		int result = 0;
		if(num == 1)
 		return 0;
		
		if(memo[num] !=0)
			return memo[num];

		result = 1 + topDownApproach(num-1);
		if(num % 2 == 0){
			result = Math.min(result, 1+topDownApproach(num/2));
		}
		if(num %3 == 0){
			result = Math.min(result, 1+topDownApproach(num/3));
		}
		memo[num] = result;
		return result;
	}
	
	public static int bottomUpApproach(int num){
		memo[1] = 0;
		for(int i=2;i<=num;i++){
			//System.out.println("No of call in bottom up "+(numCall++));
			
			memo[i] = memo[i-1] +1;
			if(i %2 == 0){
				memo[i] = Math.min(memo[i], 1 + memo[i/2]);
			}
			if(i%3 == 0){
				memo[i] = Math.min(memo[i],1 + memo[i/3]);
			}
		}
		return memo[num];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		memo = new int[num+1];
		int returnValue = bottomUpApproach(num);
		System.out.println("Min value bottom up approach of value is  "+returnValue);
		Arrays.fill(memo, 0);
		numCall=0;
		returnValue = topDownApproach(num);
		System.out.println("Min value top down approach of value is "+returnValue);
	}

}

