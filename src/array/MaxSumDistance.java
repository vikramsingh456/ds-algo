package array;

public class MaxSumDistance {

	private int maxSumr(int[] A){
		int index = 0;
		int result = 0;

		for(int i = 0; i < A.length; i++){
		    int total = A[i] + i + A[index] - index;
		    result = Math.max(result, total);
		    if(A[i] - i > A[index] - index){
		        index = i;
		    }
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{4,1,2,3};
		MaxSumDistance msd = new MaxSumDistance();
		System.out.println(msd.maxSumr(A));
	}

}
