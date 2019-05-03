package dp;

public class HouseRobber {

	public int maxRobbingAmount(int[] houseValues){
		
		int[] maxProfit = new int[houseValues.length];
		maxProfit[0] = houseValues[0];
		maxProfit[1] = Math.max(houseValues[0], houseValues[1]);
		
		for(int houseIndex=2; houseIndex < houseValues.length; houseIndex++){
			maxProfit[houseIndex] = Math.max(houseValues[houseIndex]+maxProfit[houseIndex-2], maxProfit[houseIndex - 1]);
		}
		return maxProfit[maxProfit.length-1];
	}
	public static void main(String[] args) {
	
		HouseRobber houseRobber = new HouseRobber();
		
		int[] houseValues = {1,2,30,4,5,60,7,8,9,10};
		System.out.println("Max profit is "+houseRobber.maxRobbingAmount(houseValues));
	}

}
