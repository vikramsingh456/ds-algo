package dp;

public class AllSets {

	public static String str = "ABCD";
	
	public static void allPossibleSetsByString(int index,String subSets){
		if(index<0){
			return ;
		}
		
		allPossibleSetsByString(index-1, subSets);
		subSets = str.charAt(index)+" "+subSets;
		allPossibleSetsByString(index-1 ,subSets);
		System.out.println(subSets);
	
	}
	
	public static void allPossibleSets(int index, int[] arr){
		if(index<0)
			return;
		if(index == 0){
			arr[index] = 0;
			printArr(arr);
			arr[index] = 1;
			printArr(arr);
					
		}
		
		arr[index] = 0;
		allPossibleSets(index-1,arr);
		arr[index] = 1;
		allPossibleSets(index-1,arr);
	}
	
	public static void printArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 1){
				System.out.print(str.charAt(i)+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[str.length()];
		allPossibleSetsByString(str.length()-1,"");
		allPossibleSets(str.length()-1, a);
	}

}
