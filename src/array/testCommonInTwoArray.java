package array;
import util.array.ArrayUtil;

public class testCommonInTwoArray {

	public static void main(String[] args) {
	
		int a[] = {2,5,16,19};
		int b[] = {2,5,7,9};
		
		System.out.print("A= ");
		for(int theA: a){
			System.out.print(theA+" ");
		}
		System.out.print("\nB= ");
		for(int theB : b){
			System.out.print(theB+" ");
		}
		Object commonValues[] = ArrayUtil.intCommonInTwoArray(b, a);
		System.out.println("\nCommon values in the given two arrays ");
		for(Object theVal : commonValues){
			System.out.print(theVal+" ");
		}
	}

}
