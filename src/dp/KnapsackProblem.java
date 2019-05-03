package dp;

import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem {

	public int bagWihtLargestValue(List<KnapsackItem> items,int knapsakWeight)
	{
		int values[][] = new int[items.size()+1][knapsakWeight+1];
		for(int i=0;i<values[0].length;i++){
			values[0][i] = 0;
		}
		for(int i=0;i<values.length;i++){
			values[i][0] = 0;
		}
		
		for(int item = 1;item<=items.size();item++){
			for(int weight = 1;weight<=knapsakWeight;weight++){
				if(items.get(item-1).getItemWeight()<=weight){
					int v1 = items.get(item-1).getItemValue() + values[item-1][weight-(items.get(item-1).getItemWeight())];
					int v2 = values[item-1][weight];
					values[item][weight] = Math.max(v1, v2);
				}
				else{
					values[item][weight] = values[item-1][weight];
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
	
	public static void main(String[] args) 
	{
		List<KnapsackItem> items = new ArrayList<KnapsackItem>();
		items.add(new KnapsackItem(100,1));
		items.add(new KnapsackItem(20,3));
		items.add(new KnapsackItem(30,5));
		items.add(new KnapsackItem(40,10));
		items.add(new KnapsackItem(80,1));
		
		int knapsakWeight = 10;
		
		KnapsackProblem knapsackProb = new KnapsackProblem(); 
		System.out.println("Knapsack with max weight is "+knapsackProb.bagWihtLargestValue(items, knapsakWeight));
	}

}
