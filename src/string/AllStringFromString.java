package string;

public class AllStringFromString {

	public static void myPermutation(String word){
		int n = word.length();
		for(int i=0;i<n;i++){
			System.out.println(word);
			word = word.substring(i+1, n)+word.substring(0, i+1);
		}
	}
	
	public static void permutation(String word){
		permutation("",word);
	}

	public static void permutation(String prefix,String word){
		
		int n = word.length();
		if(n==0)
			System.out.println(prefix);
		else
		{
			for(int i=0;i<n;i++){
				permutation(prefix+word.charAt(i),word.substring(0, i)+word.substring(i+1, n));
			}
		}
	}
	
	public static void main(String[] args) {
		permutation("abcd");
		//myPermutation("abc");
	}

}
