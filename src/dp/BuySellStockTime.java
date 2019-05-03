package dp;

public class BuySellStockTime {
	public static  void sellStock(int[] stockPrice){
		int stockBuyPrice = Integer.MAX_VALUE,buyPrice = 0;
		
		int stockSellPrice = stockPrice[1];
		
		int maxProfit = 0;
		for(int i=0;i<stockPrice.length;i++){
			//maxProfit = Math.max(maxProfit, stockPrice[i]-stockBuyPrice);
			if((stockPrice[i]-stockBuyPrice) > maxProfit){
				maxProfit = stockPrice[i] - stockBuyPrice;
				stockSellPrice = stockPrice[i];
				buyPrice = stockBuyPrice;
			}
			stockBuyPrice = Math.min(stockPrice[i], stockBuyPrice);
			
		}
		System.out.println("Stock Buy Price: "+buyPrice);
		System.out.println("Stock Sell Price: "+stockSellPrice);
		System.out.println("Max Profit Price: "+maxProfit);
	}
	
	public int maxProfit(int[] stockPrice){
		int maxProfit = Integer.MIN_VALUE,buyPrice = Integer.MAX_VALUE;
		for(int dayIndex=0;dayIndex < stockPrice.length; dayIndex++){
			buyPrice = Math.min(buyPrice, stockPrice[dayIndex]);
			maxProfit = Math.max(maxProfit, stockPrice[dayIndex] - buyPrice);
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuySellStockTime stockTransTime = new BuySellStockTime();
		//int[] stockPrice1 = {2,4,11,80,5,6,10,19,1,15,40};
		int[] stockPrice = {10,20,2,13};
		sellStock(stockPrice);
		
		System.out.println();
		System.out.println("Max profit is "+stockTransTime.maxProfit(stockPrice));
		
	}

}
