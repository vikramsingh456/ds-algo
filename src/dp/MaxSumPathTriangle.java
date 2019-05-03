package dp;

import util.array.ArrayUtil;

public class MaxSumPathTriangle {

	public int[] calculateSumPath(int[][] triangle){
		
		int[] prevRow = {triangle[0][0]};
		int[] curRow = null;
		for(int rootLevel = 1; rootLevel < triangle.length; rootLevel++){
			curRow = new int[prevRow.length * 2];
			for(int i=0,j=0; i < prevRow.length; i++,j += 2){
				curRow[j] = prevRow[i] + triangle[rootLevel][i];
				curRow[j + 1] = prevRow[i] + triangle[rootLevel][i+1];
			}
			prevRow = curRow;
		}
		
		return curRow;
	} 
	
	public int getMaxPath(int[][] trianglePath){
		
		return ArrayUtil.getMax(calculateSumPath(trianglePath));
	}
	
	public int getMinPath(int[][] trianglePath){
		return ArrayUtil.getMin(calculateSumPath(trianglePath));
	}
	
	public static void main(String[] args) {
	
		MaxSumPathTriangle sumPath = new MaxSumPathTriangle();
		
		int[][] trianglePath = {{1},{2,3},{4,5,6},{7,8,9,10,11}};
		
		System.out.println("Max sum path is "+sumPath.getMaxPath(trianglePath));
		System.out.println("Min sum path is "+sumPath.getMinPath(trianglePath));
	}

}
