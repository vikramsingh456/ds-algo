package dp;

public class MaxSubMatrixWith1s {

	public void printMatrix(int[][] matrix){
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void subMatrix(int[][] arrA,int rows,int cols){
		
		int[][] subMatrix = new int[rows][cols];
		
		//fill the first row
		for(int i=0;i<cols;i++){
			subMatrix[0][i] = arrA[0][i];
		}
		
		//fill the first column
		for(int i=0;i<rows;i++){
			subMatrix[i][0] = arrA[i][0];
		}
		
		int maxSquare = 0;
		for(int i=1;i<rows;i++){
			for(int j=1;j<cols;j++){
				if(arrA[i][j] == 1){
					subMatrix[i][j] = Math.min(subMatrix[i-1][j-1],Math.min(subMatrix[i][j-1],subMatrix[i-1][j]))+1;
				}
				else
					subMatrix[i][j] = 0;
				if(subMatrix[i][j] > maxSquare){
					maxSquare = subMatrix[i][j];
				}
			}
		}
		System.out.println("Maximum sub Square size is "+maxSquare);
		//printMatrix(subMatrix);
	}
	
	public static void main(String[] args) {
		
		int [][] matrix = {{0,1,0,1,0,1,0,1},{1,0,1,1,1,1,1,0,},{0,1,1,1,1,1,1,0},
						   {0,0,1,1,1,1,1,0},{1,1,1,1,1,1,1,1}};
		
		MaxSubMatrixWith1s maxSquare = new MaxSubMatrixWith1s();
		
		maxSquare.printMatrix(matrix);
		System.out.println("-----------------");
		maxSquare.subMatrix(matrix, 5, 8);
		

	}

}
