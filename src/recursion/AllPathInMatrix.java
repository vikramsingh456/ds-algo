package recursion;

public class AllPathInMatrix {

	int rowIndex,colIndex;
	int[][] matrix;
	
	public void allPaths(int[][] matrix){
		
		this.matrix = matrix;
		rowIndex = matrix.length;
		colIndex = matrix[0].length;
		printAllPaths(0,0,"");
	}
	
	public void printAllPaths(int curRow, int curCol, String path){
		if(curRow >= rowIndex || curCol>= colIndex)
			return;
		if(curRow == (rowIndex - 1) && curCol == (colIndex-1)){
			path = path + "-" + matrix[curRow][curCol];
			System.out.println(path);
		}
		
		path = path + "-" + matrix[curRow][curCol];
		printAllPaths(curRow+1,curCol,path);
		printAllPaths(curRow,curCol+1,path);
	}
	
	public static void main(String[] args) {
	
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		AllPathInMatrix allPath = new AllPathInMatrix();
		allPath.allPaths(matrix);
		
	}

}
