package dp;

interface PrintDiagonal{
	void printDiagonal();
}

class PrintRowWiseDiagonal implements PrintDiagonal{

	private int[][] matrix;
	public PrintRowWiseDiagonal(int[][] matrix){
		this.matrix = matrix;
		
	}
	
	@Override
	public void printDiagonal() {
	
		int startIndex = 0,endIndex = this.matrix[0].length;
		for(int i=startIndex;i<endIndex;i++){
			for(int theRow=i,theCol=0;theRow>=0;theRow--,theCol++){
				System.out.print(matrix[theRow][theCol]+" ");
			}
			System.out.println();
		}
	}
	
}

class PrintColumWiseDiagonal implements PrintDiagonal{

	private int[][] matrix;
	public PrintColumWiseDiagonal(int[][] matrix){
		this.matrix = matrix;
		
	}
	
	@Override
	public void printDiagonal() {
		// TODO Auto-generated method stub
		
		int endIndex = matrix[0].length;
		for(int i=1;i<endIndex;i++){
			for(int theRow=endIndex-1,theCol=i;theCol<endIndex;theRow--,theCol++){
				System.out.print(matrix[theRow][theCol]+" ");
			}
			System.out.println();
		}
	}
	
}


public class AllDiagonalPrint {

	private static int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDiagonal rowDiagonal = new PrintRowWiseDiagonal(matrix);
		rowDiagonal.printDiagonal();
		
		PrintDiagonal colDiagonal = new PrintColumWiseDiagonal(matrix);
		colDiagonal.printDiagonal();
	}

} 
