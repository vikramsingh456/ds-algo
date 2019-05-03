package dp;

import java.util.Arrays;

public class CoinChangeProblem {

	private int coinDenomination[] = {1,2,3,5};
	
	public int minCoinToAmount(int amount){
		if(amount <0)
			return 0;
		
		int memoCoins[] = new int[amount+1];
		Arrays.fill(memoCoins, Integer.MAX_VALUE);
	
		for(int i=0; ( i<coinDenomination.length && coinDenomination[i]<memoCoins.length)  ; i++){
			
			memoCoins[coinDenomination[i]] = 1;
		}
		memoCoins[0] = 0;
		
		for(int i=0;i<=amount;i++){
			for(int firstIndex=0,lastIndex=i;firstIndex<=lastIndex;firstIndex++,lastIndex--){
				memoCoins[i] = Math.min(memoCoins[i],(memoCoins[firstIndex]+memoCoins[lastIndex]));
			}
		}
		for(int i=0;i<memoCoins.length;i++)
			System.out.println(memoCoins[i]);
		return memoCoins[amount];
	}
	
	public int minCoinToAmountBy2DArray(int amount)
	{
		int values[][] = new int[coinDenomination.length+1][amount+1];
		
		for(int i=0;i<values.length;i++){values[i][0] = 0;}
		for(int i=0;i<values[0].length;i++){values[0][i] = 0;}
		
		for(int i=1,c=0;c < coinDenomination.length;i++,c++){
			for(int j=1;j<values[0].length;j++){
				System.out.println(i+","+j);
				if(coinDenomination[c]>j){
					values[i][j] = values[i-1][j];
				}else{
					int v1 = values[i-1][j];
					int v2 = 1 + values[i][j - coinDenomination[c]];
					values[i][j] = Math.min(v1, v2);
				}
				
			}
		}
		
		for(int i=0;i<values.length;i++){
			for(int j=0;j<values[0].length;j++){
				System.out.print(values[i][j]+" ");
			}
			System.out.println();
		}
		
		return values[values.length-1][values[0].length-1];
	}
	public static void main(String[] args) {
		
		CoinChangeProblem coinProb = new CoinChangeProblem();
		int amount = 10;
		
		System.out.println("Minimum coin for amount "+amount + " is "+coinProb.minCoinToAmountBy2DArray(amount));
	}

}
